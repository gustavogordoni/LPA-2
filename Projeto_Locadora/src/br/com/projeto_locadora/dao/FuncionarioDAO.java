package br.com.projeto_locadora.dao;

/**
 * Importando as classes necessárias para trabalhar nesta classe
 */
import br.com.projeto_locadora.dto.FuncionarioDTO;
import java.sql.*;

/**
 * Essa classe contém os métodos para inserir, alterar, consultar e excluir
 * Pessoa e seus filhos (funcionario)
 * Disciplina de LPA - Integrado IFSP
 *
 * @author Andre Luis Gobbi Primo/Marcelo Luis Murari
 * @version 2.0
 */
public class FuncionarioDAO extends PessoaDAO {
    

    /**
     * Método construtor da classe
     */
    public FuncionarioDAO() {
    }

    //Atributo do tipo ResultSet utilizado para realizar consultas
    private ResultSet rs = null;
    //Manipular o banco de dados
    private Statement stmt = null;
    //Cria um objeto pessoaDAO para chamar a classe
    PessoaDAO pessoaDAO = new PessoaDAO();
    
      
    /**
     * Método utilizado para inserir um objeto FuncionarioDTO no banco de dados
     *
     * @param funcionarioDTO que vem da classe FuncionarioCTR
     * @return Um boolean 
     */
    public boolean inserirFuncionario(FuncionarioDTO funcionarioDTO) {
        String comando = "";
        try {
            int id_aux = this.inserirPessoa(funcionarioDTO);
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            
            comando = "Insert into Funcionario (log_fun, sen_fun, id_pes) values ( "
                    + "'" + funcionarioDTO.getLog_fun() + "', "
                    + "'" + funcionarioDTO.getSen_fun() + "', "
                    + id_aux + ")";
            
            stmt.execute(comando);
            
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            return true;
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println("Erro FuncionarioDAO" + e.getMessage());
            return false;
        } //Independente de dar erro ou não ele vai fechar o banco de dados.
        finally {
            //Chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }
    }//Fecha o método inserirFuncionario
    
    
    /**
     * Método utilizado para alterar um objeto FuncionarioDTO no banco de dados
     *
     * @param funcionarioDTO que vem da classe FuncionarioCTR
     * @return Um boolean 
     */
    public boolean alterarFuncionario(FuncionarioDTO funcionarioDTO) {
        String comando = "";
        try {
            if(this.alterarPessoa(funcionarioDTO)){
                //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
                ConexaoDAO.ConectDB();
                //Cria o Statement que responsavel por executar alguma coisa no banco de dados
                stmt = ConexaoDAO.con.createStatement();
                //Comando SQL que sera executado no banco de dados
                comando = "Update Funcionario set "
                        + "log_fun = '" + funcionarioDTO.getLog_fun() + "', "
                        + "sen_fun = '" + funcionarioDTO.getSen_fun() + "' "
                        + "where id_pes = " + funcionarioDTO.getId_pes();

                stmt.execute(comando);

                ConexaoDAO.con.commit();
                //Fecha o statement
                stmt.close();
                return true;
            }
            else{
                return false;
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } //Independente de dar erro ou não ele vai fechar o banco de dados.
        finally {
            //Chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }
    }//Fecha o método aletarFuncionario

    
    /**
     * Método utilizado para excluir um objeto FuncionarioDTO no banco de dados
     *
     * @param funcionarioDTO que vem da classe FuncionarioCTR
     * @return Um boolean 
     */
    public boolean excluirFuncionario(FuncionarioDTO funcionarioDTO) {
        String comando = "";
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            
            comando = "Delete from Funcionario " +
                      "Where id_pes = " + funcionarioDTO.getId_pes();
           
            stmt.execute(comando);
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            
            if(this.excluirPessoa(funcionarioDTO)){
                return true;
            }
            else{
                return false;
            }
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        } //Independente de dar erro ou não ele vai fechar o banco de dados.
        finally {
            //Chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }
    }//Fecha o método excluirFuncionario
    

    /**
     * Método utilizado para consultar um objeto FuncionarioDTO no banco de dados
     * @param funcionarioDTO que vem da classe FuncionarioCTR
     * @param opcao que vem da classe FuncionarioCTR
     * @return Um ResultSet com os dados do funcionario
     */
    public ResultSet consultarFuncionario(FuncionarioDTO funcionarioDTO, int opcao) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando="";
            
            switch(opcao){
                case 1: //Pesquisa por nome
                    comando = "Select p.* " + 
                              "from Pessoa p, Funcionario f " + 
                              "where f.id_pes = p.id_pes and " +
                              "p.nom_pes like '" + funcionarioDTO.getNom_pes() + "%' " +
                              "order by p.nom_pes";
                    break;
                    
                case 2: //Pesquisa por id
                    comando = "Select p.*, f.* " +
                              "from Pessoa p, Funcionario f " + 
                              "where f.id_pes = p.id_pes and " +
                              "p.id_pes = " + funcionarioDTO.getId_pes();
                    
            }//fecha switch opcao
            //Executa o comando SQL no banco de Dados
            rs = stmt.executeQuery(comando.toUpperCase());

            return rs;

        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }//Fecha o método consultarFuncionario

    
    /**
     * Método utilizado para logar um objeto FuncionarioDTO no sistema
     *
     * @param funcionarioDTO, opcao que vem da classe PessoaCTR
     * @return Um int 1-Logado 2-Não Logado
     */
    public int logarFuncionario(FuncionarioDTO funcionarioDTO) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando = "Select f.id_pes " +
                             "from Funcionario f " + 
                             "where f.log_fun = '" + funcionarioDTO.getLog_fun()+ "'" +
                             " and f.sen_fun = '" + funcionarioDTO.getSen_fun() + "'";

            //Executa o comando SQL no banco de Dados
            rs = null;
            rs = stmt.executeQuery(comando);
            if(rs.next()){
                return rs.getInt("id_pes");
            }
            else{
                return 0;
            }
                
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
        finally{
            ConexaoDAO.CloseDB();
        }
    }//Fecha o método logarFuncionario
    
}//Fecha a classe FuncionarioDAO
