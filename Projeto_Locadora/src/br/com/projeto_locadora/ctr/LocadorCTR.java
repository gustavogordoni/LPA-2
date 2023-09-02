package br.com.projeto_locadora.ctr;

/**
 * Importando as classes necessárias para trabalhar nesta classe
 */
import java.sql.*;
import br.com.projeto_locadora.dto.LocadorDTO;
import br.com.projeto_locadora.dao.LocadorDAO;
import br.com.projeto_locadora.dao.ConexaoDAO;

/**
 * Essa classe contém os métodos para inserir, alterar, consultar e excluir
 * Pessoa e seus filho (locador)
 * Disciplina de LPA - Integrado IFSP
 *
 * @author Andre Luis Gobbi Primo/Marcelo Luis Murari
 * @version 2.0
 */
public class LocadorCTR {
    LocadorDAO locadorDAO = new LocadorDAO();

    /**
     * Método construtor da classe
     */
    public LocadorCTR() {
    }

    
    /**
     * Método utilizado para controlar o acesso ao método inserirLocador da classe
     * LocadorDAO
     *
     * @param locadorDTO que vem da classe da página (VIEW)
     * @return String contendo a mensagem
     */
    public String inserirLocador(LocadorDTO locadorDTO) {
        try {
            //Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (locadorDAO.inserirLocador(locadorDTO)) {
                return "Locador Cadastrado com Sucesso!!!";
            } else {
                return "Locador NÃO Cadastrado!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Locador NÃO Cadastrado!!!";
        }
    }//Fecha o método inserirLocador

    
    /**
     * Método utilizado para controlar o acesso ao método alterarLocador da classe
     * LocadorDAO
     *
     * @param locadorDTO que vem da classe da página (VIEW)
     * @return String contendo a mensagem
     */
    public String alterarLocador(LocadorDTO locadorDTO) {
        try {
            //Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (locadorDAO.alterarLocador(locadorDTO)) {
                return "Locador Alterado com Sucesso!!!";
            } else {
                return "Locador NÃO Alterado!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Locador NÃO Alterado!!!";
        }
    }//Fecha o método alterarLocador
    
        
    /**
     * Método utilizado para controlar o acesso ao método excluirLocador da classe
     * LocadorDAO
     *
     * @param locadorDTO que vem da classe da página (VIEW)
     * @return String contendo a mensagem
     */
    public String excluirLocador(LocadorDTO locadorDTO) {
        try {
            if (locadorDAO.excluirLocador(locadorDTO)) {
                return "Locador Excluido com Sucesso!!!";
            } else {
                return "Locador NÃO Excluido!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Locador NÃO Excluido!!!";
        }
    }//Fecha o método excluirLocador

     
    /**
     * Método utilizado para controlar o acesso ao método consultarLocador da
     * classe LocadorDAO
     *
     * @param locadorDTO, opcao que vem da classe da página (VIEW)
     * @param opcao que vem da classe da página (VIEW)
     * @return ResultSet com os dados do locador
     */
    public ResultSet consultarLocador(LocadorDTO locadorDTO, int opcao) {
        //É criado um atributo do tipo ResultSet, pois este método recebe o resultado de uma consulta.
        ResultSet rs = null;

        //O atributo rs recebe a consulta realizada pelo método da classe DAO
        rs = locadorDAO.consultarLocador(locadorDTO, opcao);

        return rs;
    }//Fecha o método consultarLocador


    /**
     * Método utilizado para controlar o acesso ao método CloseDB da classe
     * ConexaoDAO
     */
    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }//Fecha o método CloseDB

}//fecha a classe LocadorCTR
