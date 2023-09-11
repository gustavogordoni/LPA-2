package br.com.ouviacess.dao;

import br.com.ouviacess.dto.RequerimentosDTO;
import br.com.ouviacess.dto.AdministradorDTO;

import java.sql.*;

public class RequerimentosDAO {
    /**
     * Método construtor da classe RequerimentosDAO
     */    
    public RequerimentosDAO() {
    }    
    //Atributo do tipo ResultSet utilizado para realizar consultas
    private ResultSet rs = null;
    //Manipular o banco de dados
    private Statement stmt = null;
    
    /**
     * Método utilizado para inserir um objeto requerimentosDTO no banco de dados
     *
     * @param requerimentosDTO, que vem da classe RequerimentosCTR
     * @return Um boolean
     */
    public boolean inserirRequerimentos(RequerimentosDTO requerimentosDTO, AdministradorDTO administradorDTO) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "INSERT INTO requerimento (id_administrador, resposta)" + "VALUES ( "
                + "'" + administradorDTO.getId_administrador() + ", "
                + "'" + requerimentosDTO.getResposta() + "'";           
            
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
    }//Fecha o método inserirRequerimentos
    
    /**
     * Método utilizado para excluir um objeto requerimentosDTO no banco de dados
     *
     * @param requerimentosDTO que vem da classe RequerimentosCTR
     * @return Um boolean
     
    public boolean excluirRequerimentos(RequerimentosDTO requerimentosDTO) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "DELETE FROM requerimentos WHERE id_requerimentos = " + requerimentosDTO.getId_requerimento();

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
    }//Fecha o método excluirRequerimentos
    */
    
    /**
     * Método utilizado para alterar um objeto requerimentosDTO no banco de dados
     *
     * @param requerimentosDTO, que vem da classe RequerimentosCTR
     * @return Um boolean
     */
    public boolean alterarRequerimentos(RequerimentosDTO requerimentosDTO) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "UPDTATE requerimentos set "
                + "situacao = '" + requerimentosDTO.getSituacao() + "') ";
            
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
    }//Fecha o método alterarRequerimentos
    
    /**
     * Método utilizado para consultar um objeto requerimentosDTO no banco de dados
     *
     * @param requerimentosDTO, que vem da classe RequerimentosCTR
     * @param opcao, que vem da classe RequerimentosCTR
     * @return Um ResultSet com os dados do requerimentos
     */
    public ResultSet consultarRequerimentos(RequerimentosDTO requerimentosDTO, int opcao) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "";
            switch (opcao){
                case 1:
                    comando = "SELECT r.* "+
                        "FROM requerimentos r "+
                        "WHERE id_requerimentos LIKE '" + requerimentosDTO.getId_requerimento() + "%' " +
                        "ORDER BY r.id_requerimento";
                    
                break;
                case 2:
                    comando = "SELECT r.* "+
                        "FROM requerimentos r " +
                        "WHERE r.id_requerimento = " + requerimentosDTO.getId_requerimento();
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
    }//Fecha o método consultarRequerimentos
    
}//Fecha a classe RequerimentosDAO