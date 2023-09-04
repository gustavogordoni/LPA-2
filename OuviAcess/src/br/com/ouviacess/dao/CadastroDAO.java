package br.com.ouviacess.dao;
/**
 *
 * @author Aluno
 */
import br.com.ouviacess.dto.CadastroDTO;
import java.sql.*;

public class CadastroDAO {
    /**
     * Método construtor da classe CadastroDAO
     */    
    public CadastroDAO() {
    }    
    //Atributo do tipo ResultSet utilizado para realizar consultas
    private ResultSet rs = null;
    //Manipular o banco de dados
    private Statement stmt = null;
    
    /**
     * Método utilizado para inserir um objeto cadastroDTO no banco de dados
     *
     * @param cadastroDTO, que vem da classe CadastroCTR
     * @return Um boolean
     */
    public boolean inserirCadastro(CadastroDTO cadastroDTO) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "INSERT INTO Cadastro (nome, cpf, rg, email, senha, ddd, telefone)" + "VALUES ( "
                + "'" + cadastroDTO.getNome() + "', "
                + "'" + cadastroDTO.getCpf() + ", "
                + "'" + cadastroDTO.getRg() + "', "
                + "'" + cadastroDTO.getEmail() + "', "
                + "'" + cadastroDTO.getSenha() + "', "
                + "'" + cadastroDTO.getDdd() + "', "                   
                + "'" + cadastroDTO.getTelefone() 
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
    }//Fecha o método inserirCadastro
    
}//Fecha a classe CadastroDAO
