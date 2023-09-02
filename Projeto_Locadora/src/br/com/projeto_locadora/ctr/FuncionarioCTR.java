package br.com.projeto_locadora.ctr;

/**
 * Importando as classes necessárias para trabalhar nesta classe
 */
import java.sql.*;
import br.com.projeto_locadora.dto.FuncionarioDTO;
import br.com.projeto_locadora.dao.FuncionarioDAO;
import br.com.projeto_locadora.dao.ConexaoDAO;

/**
 * Essa classe contém os métodos para inserir, alterar, consultar e excluir
 * Pessoa e seus filho (funcionario)
 * Disciplina de LPA - Integrado IFSP
 *
 * @author Andre Luis Gobbi Primo/Marcelo Luis Murari
 * @version 2.0
 */
public class FuncionarioCTR {
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    /**
     * Método construtor da classe
     */
    public FuncionarioCTR() {
    }

    
    /**
     * Método utilizado para controlar o acesso ao método inserirFuncionario da classe
     * FuncionarioDAO
     *
     * @param funcionarioDTO que vem da classe da página (VIEW)
     * @return String contendo a mensagem
     */
    public String inserirFuncionario(FuncionarioDTO funcionarioDTO) {
        try {
            //Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (funcionarioDAO.inserirFuncionario(funcionarioDTO)) {
                return "Funcionário Cadastrado com Sucesso!!!";
            } else {
                return "Funcionário NÃO Cadastrado!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Funcionário NÃO Cadastrado!!!";
        }
    }//Fecha o método inserirFuncionario

    
    /**
     * Método utilizado para controlar o acesso ao método alterarFuncionario da classe
     * FuncionarioDAO
     *
     * @param funcionarioDTO que vem da classe da página (VIEW)
     * @return String contendo a mensagem
     */
    public String alterarFuncionario(FuncionarioDTO funcionarioDTO) {
        try {
            //Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (funcionarioDAO.alterarFuncionario(funcionarioDTO)) {
                return "Funcionário Alterado com Sucesso!!!";
            } else {
                return "Funcionario NÃO Alterado!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Funcionario NÃO Alterado!!!";
        }
    }//Fecha o método alterarFuncionario
    
        
    /**
     * Método utilizado para controlar o acesso ao método excluirFuncionario da classe
     * FuncionarioDAO
     *
     * @param funcionarioDTO que vem da classe da página (VIEW)
     * @return String contendo a mensagem
     */
    public String excluirFuncionario(FuncionarioDTO funcionarioDTO) {
        try {
            if (funcionarioDAO.excluirFuncionario(funcionarioDTO)) {
                return "Funcionário Excluido com Sucesso!!!";
            } else {
                return "Funcionário NÃO Excluido!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Funcionário NÃO Excluido!!!";
        }
    }//Fecha o método excluirFuncionario

     
    /**
     * Método utilizado para controlar o acesso ao método consultarFuncionario da
     * classe FuncionarioDAO
     *
     * @param funcionarioDTO, opcao que vem da classe da página (VIEW)
     * @param opcao que vem da classe da página (VIEW)
     * @return ResultSet com os dados do funcionario
     */
    public ResultSet consultarFuncionario(FuncionarioDTO funcionarioDTO, int opcao) {
        //É criado um atributo do tipo ResultSet, pois este método recebe o resultado de uma consulta.
        ResultSet rs = null;

        //O atributo rs recebe a consulta realizada pelo método da classe DAO
        rs = funcionarioDAO.consultarFuncionario(funcionarioDTO, opcao);

        return rs;
    }//Fecha o método consultarFuncionario


    /**
     * Método utilizado para controlar o acesso ao método logarFuncionario da
     * classe FuncionarioDAO
     *
     * @param funcionarioDTO, opcao que vem da classe da página (VIEW)
     * @return int com os dados do usuario
     */
    public int logarFuncionario(FuncionarioDTO funcionarioDTO) {
        
        return funcionarioDAO.logarFuncionario(funcionarioDTO);

    }//Fecha o método logarFuncionario
    
    
    /**
     * Método utilizado para controlar o acesso ao método CloseDB da classe
     * ConexaoDAO
     */
    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }//Fecha o método CloseDB

}//fecha a classe FuncionarioCTR
