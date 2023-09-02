package br.com.projeto_locadora.ctr;

/**
 * Importando as classes necessárias para trabalhar nesta classe
 */
import java.sql.*;
import br.com.projeto_locadora.dto.LocacaoDTO;
import br.com.projeto_locadora.dto.CarroDTO;
import br.com.projeto_locadora.dto.LocadorDTO;
import br.com.projeto_locadora.dao.LocacaoDAO;
import br.com.projeto_locadora.dao.ConexaoDAO;

/**
 * Essa classe contém os métodos para inserir, alterar, consultar e excluir
 * Locacao
 * Disciplina de LPA - Integrado IFSP
 *
 * @author Andre Luis Gobbi Primo/Marcelo Luis Murari
 * @version 2.0
 */
public class LocacaoCTR {
    LocacaoDAO locacaoDAO = new LocacaoDAO();

    /**
     * Método construtor da classe
     */
    public LocacaoCTR() {
    }

    
    /**
     * Método utilizado para controlar o acesso ao método inserirLocacao da classe
     * LocadorDAO
     *
     * @param locacaoDTO que vem da classe da página (VIEW)
     * @param carroDTO que vem da classe da página (VIEW)
     * @param locadorDTO que vem da classe da página (VIEW)
     * @return String contendo a mensagem
     */
    public String inserirLocacao(LocacaoDTO locacaoDTO, CarroDTO carroDTO, LocadorDTO locadorDTO) {
        try {
            //Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (locacaoDAO.inserirLocacao(locacaoDTO, carroDTO, locadorDTO)) {
                return "Locação Cadastrada com Sucesso!!!";
            } else {
                return "Locação NÃO Cadastrada!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Locação NÃO Cadastrada!!!";
        }
    }//Fecha o método inserirLocacao

    
    /**
     * Método utilizado para controlar o acesso ao método alterarLocacao da classe
     * LocacaoDAO
     *
     * @param locacaoDTO que vem da classe da página (VIEW)
     * @return String contendo a mensagem
     */
    public String alterarLocacao(LocacaoDTO locacaoDTO) {
        try {
            //Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (locacaoDAO.alterarLocacao(locacaoDTO)) {
                return "Locação Alterado com Sucesso!!!";
            } else {
                return "Locação NÃO Alterado!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Locação NÃO Alterado!!!";
        }
    }//Fecha o método alterarLocacao
    
             
    /**
     * Método utilizado para controlar o acesso ao método consultarLocacao da
     * classe LocacaoDAO
     *
     * @param locacaoDTO, opcao que vem da classe da página (VIEW)
     * @param carroDTO, opcao que vem da classe da página (VIEW)
     * @param opcao que vem da classe da página (VIEW)
     * @return ResultSet com os dados do locador
     */
    public ResultSet consultarLocacao(LocacaoDTO locacaoDTO, CarroDTO carroDTO, int opcao) {
        //É criado um atributo do tipo ResultSet, pois este método recebe o resultado de uma consulta.
        ResultSet rs = null;

        //O atributo rs recebe a consulta realizada pelo método da classe DAO
        rs = locacaoDAO.consultarLocacao(locacaoDTO, carroDTO, opcao);

        return rs;
    }//Fecha o método consultarLocacao


    /**
     * Método utilizado para controlar o acesso ao método CloseDB da classe
     * ConexaoDAO
     */
    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }//Fecha o método CloseDB

}//fecha a classe LocacaoCTR
