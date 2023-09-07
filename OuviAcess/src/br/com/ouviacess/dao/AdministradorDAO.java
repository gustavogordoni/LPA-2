package br.com.ouviacess.dao;

import br.com.ouviacess.dto.AdministradorDTO;
import java.sql.*;

public class AdministradorDAO {
    /**
     * Método construtor da classe AdministradorDAO
     */    
    public AdministradorDAO() {
    }    
    //Atributo do tipo ResultSet utilizado para realizar consultas
    private ResultSet rs = null;
    //Manipular o banco de dados
    private Statement stmt = null;
    
    /**
     * Método utilizado para inserir um objeto administradorDTO no banco de dados
     *
     * @param administradorDTO, que vem da classe AdministradorCTR
     * @return Um boolean
     */
    public boolean inserirAdministrador(AdministradorDTO administradorDTO) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "INSERT INTO administrador (nome, cpf, rg, email, senha, ddd, telefone)" + "VALUES ( "
                + "'" + administradorDTO.getNome() + "', "
                + "'" + administradorDTO.getCpf() + ", "
                + "'" + administradorDTO.getRg() + "', "
                + "'" + administradorDTO.getEmail() + "', "
                + "'" + administradorDTO.getSenha() + "', "
                + "'" + administradorDTO.getDdd() + "', "                   
                + "'" + administradorDTO.getTelefone() 
                + "') ";           
            
            //System.out.println(comando);
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
    }//Fecha o método inserirAdministrador
    
    /**
     * Método utilizado para excluir um objeto administradorDTO no banco de dados
     *
     * @param administradorDTO que vem da classe AdministradorCTR
     * @return Um boolean
     */
    public boolean excluirAdministrador(AdministradorDTO administradorDTO) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "DELETE FROM administrador WHERE id_administrador = " + administradorDTO.getId_administrador();

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
    }//Fecha o método excluirAdministrador
    
    /**
     * Método utilizado para alterar um objeto administradorDTO no banco de dados
     *
     * @param administradorDTO, que vem da classe AdministradorCTR
     * @return Um boolean
     */
    public boolean alterarAdministrador(AdministradorDTO administradorDTO) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "UPDTATE administrador set "
                + "nome = '" + administradorDTO.getNome() + "', "
                + "cpf = '" + administradorDTO.getCpf() + ", "
                + "rg = '" + administradorDTO.getRg() + "', "
                + "email = '" + administradorDTO.getEmail() + "', "
                + "senha = '" + administradorDTO.getSenha() + "', "
                + "ddd = '" + administradorDTO.getDdd() + "', "                   
                + "telefone = '" + administradorDTO.getTelefone() + "') ";
            
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
    }//Fecha o método alterarAdministrador
    
    /**
     * Método utilizado para consultar um objeto administradorDTO no banco de dados
     *
     * @param administradorDTO, que vem da classe AdministradorCTR
     * @param opcao, que vem da classe AdministradorCTR
     * @return Um ResultSet com os dados do administrador
     */
    public ResultSet consultarAdministrador(AdministradorDTO administradorDTO, int opcao) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "";
            switch (opcao){
                case 1:
                    comando = "SELECT a.* "+
                        "FROM administrador a "+
                        "WHERE id_administrador LIKE '" + administradorDTO.getId_administrador() + "%' " +
                        "ORDER BY a.id_administrador";
                    
                break;
                case 2:
                    comando = "SELECT a.* "+
                        "FROM administrador a " +
                        "WHERE a.id_administrador = " + administradorDTO.getId_administrador();
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
    }//Fecha o método consultarAdministrador
    
}//Fecha a classe AdministradorDAO
