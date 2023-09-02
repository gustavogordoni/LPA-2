package br.com.projeto_locadora.dao;

/**
 * Importando as classes necessérias para trabalhar nesta classe
 */
import br.com.projeto_locadora.dto.CarroDTO;
import java.sql.*;

/**
 * Essa classe contém os métodos para inserir, alterar, consultar e excluir
 * Carro
 * Disciplina de LPA - Integrado IFSP
 *
 * @author Andre Luis Gobbi Primo/Marcelo Luis Murari
 * @version 2.0
 */
public class CarroDAO {

    /**
     * Método construtor da classe
     */
    public CarroDAO() {
    }

    //Atributo do tipo ResultSet utilizado para realizar consultas
    private ResultSet rs = null;
    //Manipular o banco de dados
    private Statement stmt = null;
    

    /**
     * Método utilizado para inserir um objeto carroDTO no banco de dados
     *
     * @param carroDTO, que vem da classe CarroCTR
     * @return Um boolean
     */
    public boolean inserirCarro(CarroDTO carroDTO) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "Insert into Carro (pla_car, ano_car, "
                    + "mar_car, des_car) values ( "
                    + "'" + carroDTO.getPla_car() + "', "
                    + carroDTO.getAno_car() + ", "
                    + "'" + carroDTO.getMar_car() + "', "
                    + "'" + carroDTO.getDes_car() + "') ";
            //Insert into carro (pla_car, ano_car, mar_car, des_car) values ('mmm555',2021,'FIAT','completo')
            
            //String comando = "Insert into Carro (pla_car, ano_car, mar_car, des_car) values ( '" + carroDTO.getPla_car() + "'," + carroDTO.getAno_car() + ", '" + carroDTO.getMar_car() + "', '" + carroDTO.getDes_car() + "') ";
            
            //System.out.println(comando);
            //Executa o comando SQL no banco de Dados
            stmt.execute(comando.toUpperCase());
            //Da um commit no banco de dados
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            return true;
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } //Independente de dar erro ou não ele vai fechar o banco de dados.
        finally {
            //Chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }
    }//Fecha o método inserirCarro

    /**
     * Método utilizado para excluir um objeto carroDTO no banco de dados
     *
     * @param carroDTO que vem da classe CarroCTR
     * @return Um boolean
     */
    public boolean excluirCarro(CarroDTO carroDTO) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "Delete from Carro where id_car = " + carroDTO.getId_car();

            //Executa o comando SQL no banco de Dados
            stmt.execute(comando);
            //Da um commit no banco de dados
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            return true;
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } //Independente de dar erro ou não ele vai fechar o banco de dados.
        finally {
            //Chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }
    }//Fecha o método excluirCarro

    /**
     * Método utilizado para alterar um objeto carroDTO no banco de dados
     *
     * @param carroDTO, que vem da classe CarroCTR
     * @return Um boolean
     */
    public boolean alterarCarro(CarroDTO carroDTO) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "Update Carro set "
                    + "pla_car = '" + carroDTO.getPla_car() + "', "
                    + "ano_car = " + carroDTO.getAno_car() + ", "
                    + "mar_car = '" + carroDTO.getMar_car() + "', "
                    + "des_car = '" + carroDTO.getDes_car() + "' "
                    + "where id_car = " + carroDTO.getId_car();
            
            //Executa o comando SQL no banco de Dados
            stmt.execute(comando.toUpperCase());
            //Da um commit no banco de dados
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            return true;
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } //Independente de dar erro ou não ele vai fechar o banco de dados.
        finally {
            //Chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }
    }//Fecha o método alterarCarro

    /**
     * Método utilizado para consultar um objeto carroDTO no banco de dados
     *
     * @param carroDTO, que vem da classe CarroCTR
     * @param opcao, que vem da classe CarroCTR
     * @return Um ResultSet com os dados do carro
     */
    public ResultSet consultarCarro(CarroDTO carroDTO, int opcao) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "";
            switch (opcao){
                case 1:
                    comando = "Select c.* "+
                              "from Carro c "+
                              "where mar_car like '" + carroDTO.getMar_car() + "%' " +
                              "order by c.mar_car";
                    
                break;
                case 2:
                    comando = "Select c.* "+
                              "from Carro c " +
                              "where c.id_car = " + carroDTO.getId_car();
                break;
                case 3:
                    comando = "Select c.id_car, c.pla_car "+
                              "from Carro c ";
                break;
                
            }
            //Executa o comando SQL no banco de Dados
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }//Fecha o método consultarCarro

}//Fecha a classe CarroDAO
