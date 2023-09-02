package br.com.projeto_locadora.ctr;

/**
 * Importando as classes necessárias para trabalhar nesta classe
 */
import java.sql.ResultSet;
import br.com.projeto_locadora.dto.CarroDTO;
import br.com.projeto_locadora.dao.CarroDAO;
import br.com.projeto_locadora.dao.ConexaoDAO;

/**
 * Essa classe faz o controle de acesso aos métodos para inserir, alterar,
 * consultar e excluir que estão na classe CarroDAO
 * Disciplina de LPA - Integrado IFSP
 *
 * @author Andre Luis Gobbi Primo/Marcelo Luis Murari
 * @version 2.0
 */
public class CarroCTR {
    CarroDAO carroDAO = new CarroDAO();

    /**
     * Método construtor da classe
     */
    public CarroCTR() {
    }

    /**
     * Método utilizado para controlar o acesso ao método inserirCarro da
     * classe CarroDAO
     *
     * @param carroDTO, que vem da classe da página (VIEW) 
     * @return String contendo a mensagem
     */
    public String inserirCarro(CarroDTO carroDTO) {
        try {
            //Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (carroDAO.inserirCarro(carroDTO)) {
                return "Carro Cadastrado com Sucesso!!!";
            } else {
                return "Carro NÃO Cadastrado!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.		
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Carro NÃO Cadastrado";
        }
    }//Fecha o método inserirCarro

    /**
     * Método utilizado para controlar o acesso ao método alterarCarro da
     * classe CarroDAO
     *
     * @param carroDTO, que vem da classe da página (VIEW) 
     * @return String contendo a mensagem
     */
    public String alterarCarro(CarroDTO carroDTO) {
        try {
            //Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (carroDAO.alterarCarro(carroDTO)) {
                return "Carro Alterado com Sucesso!!!";
            } else {
                return "Carro NÃO Alterado!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Carro NÃO Alterado!!!";
        }
    }//Fecha o método alterarCarro

    /**
     * Método utilizado para controlar o acesso ao método excluirCarro da
     * classe CarroDAO
     *
     * @param carroDTO que vem da classe da página (VIEW)
     * @return String contendo a mensagem
     */
    public String excluirCarro(CarroDTO carroDTO) {
        try {
            //Chama o metodo que esta na classe DAO aguardando uma resposta (true ou false)
            if (carroDAO.excluirCarro(carroDTO)) {
                return "Carro Excluído com Sucesso!!!";
            } else {
                return "Carro NÃO Excluído!!!";
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "Carro NÃO Excluído!!!";
        }
    }//Fecha o método excluirCarro

    /**
     * Método utilizado para controlar o acesso ao método consultarCarro da
     * classe CarroDAO
     *
     * @param carroDTO que vem da classe da página (VIEW)
     * @param opcao que vem da classe da página (VIEW)
     * @return ResultSet com os dados do produto
     */
    public ResultSet consultarCarro(CarroDTO carroDTO, int opcao) {
        //É criado um atributo do tipo ResultSet, pois este método recebe o resultado de uma consulta.
        ResultSet rs = null;

        //O atributo rs recebe a consulta realizada pelo método da classe DAO
        rs = carroDAO.consultarCarro(carroDTO, opcao);

        return rs;
    }//Fecha o método consultarCarro

    /**
     * Método utilizado para controlar o acesso ao método CloseDB da classe
     * ConexaoDAO
     */
    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }//Fecha o método CloseDB

}//Fecha a classe CarroCTR
