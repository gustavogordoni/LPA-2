package br.com.ouviacess.dao;

import br.com.ouviacess.dto.UsuariosDTO;
import java.sql.*;

public class UsuariosDAO {
    /**
     * Método construtor da classe UsuariosDAO
     */    
    public UsuariosDAO() {
    }    
    //Atributo do tipo ResultSet utilizado para realizar consultas
    private ResultSet rs = null;
    //Manipular o banco de dados
    private Statement stmt = null;
    
       
    /**
     * Método utilizado para excluir um objeto usuariosDTO no banco de dados
     *
     * @param usuariosDTO que vem da classe UsuariosCTR
     * @return Um boolean
     *
    public boolean excluirUsuarios(UsuariosDTO usuariosDTO) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "DELETE FROM usuarios WHERE id_usuarios = " + usuariosDTO.getId_usuarios();

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
    }//Fecha o método excluirUsuarios
       
    /**
     * Método utilizado para consultar um objeto usuariosDTO no banco de dados
     *
     * @param usuariosDTO, que vem da classe UsuariosCTR
     * @param opcao, que vem da classe UsuariosCTR
     * @return Um ResultSet com os dados do usuarios
     */
    public ResultSet consultarUsuarios(UsuariosDTO usuariosDTO, int opcao) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "";
            switch (opcao){
                case 1:
                    comando = "SELECT u.* "+
                        "FROM usuarios u "+
                        "WHERE id_usuario LIKE '" + usuariosDTO.getId_usuario() + "%' " +
                        "ORDER BY a.id_usuarios";
                    
                break;
                case 2:
                    comando = "SELECT a.* "+
                        "FROM usuarios a " +
                        "WHERE a.id_usuarios = " + usuariosDTO.getId_usuario();
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
    }//Fecha o método consultarUsuarios
    
}//Fecha a classe UsuariosDAO
