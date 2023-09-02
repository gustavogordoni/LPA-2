package br.com.projeto_locadora.dao;

/**
 * Importando as classes necessárias para trabalhar nesta classe
 */
import br.com.projeto_locadora.dto.LocadorDTO;
import java.sql.*;

/**
 * Essa classe contém os métodos para inserir, alterar, consultar e excluir
 * Pessoa e seus filhos (locador)
 * Disciplina de LPA - Integrado IFSP
 *
 * @author Andre Luis Gobbi Primo/Marcelo Luis Murari
 * @version 2.0
 */
public class LocadorDAO extends PessoaDAO {
    

    /**
     * Método construtor da classe
     */
    public LocadorDAO() {
    }

    //Atributo do tipo ResultSet utilizado para realizar consultas
    private ResultSet rs = null;
    //Manipular o banco de dados
    private Statement stmt = null;
    //Cria um objeto pessoaDAO para chamar a classe
    PessoaDAO pessoaDAO = new PessoaDAO();
    
      
    /**
     * Método utilizado para inserir um objeto LocadorDTO no banco de dados
     *
     * @param locadorDTO que vem da classe LocadorCTR
     * @return Um boolean 
     */
    public boolean inserirLocador(LocadorDTO locadorDTO) {
        String comando = "";
        try {
            int id_aux = this.inserirPessoa(locadorDTO);
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            
            comando = "Insert into Locador (val_cnh_loc, id_pes) values ( "
                    + "to_date('" + locadorDTO.getVal_cnh_loc()+ "', 'YYYY-MM-DD'), "
                    + id_aux + ")";
            System.out.println(comando);
            stmt.execute(comando);
            
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            return true;
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println("Erro LocadorDAO" + e.getMessage());
            return false;
        } //Independente de dar erro ou não ele vai fechar o banco de dados.
        finally {
            //Chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }
    }//Fecha o método inserirLocador
    
    
    /**
     * Método utilizado para alterar um objeto LocadorDTO no banco de dados
     *
     * @param locadorDTO que vem da classe LocadorCTR
     * @return Um boolean 
     */
    public boolean alterarLocador(LocadorDTO locadorDTO) {
        String comando = "";
        try {
            if(this.alterarPessoa(locadorDTO)){
                //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
                ConexaoDAO.ConectDB();
                //Cria o Statement que responsavel por executar alguma coisa no banco de dados
                stmt = ConexaoDAO.con.createStatement();
                //Comando SQL que sera executado no banco de dados
                comando = "Update Locador set "
                        + "val_cnh_loc = to_date('" + locadorDTO.getVal_cnh_loc()+ "', 'YYYY-MM-DD') "
                        + "where id_pes = " + locadorDTO.getId_pes();

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
    }//Fecha o método aletarLocador

    
    /**
     * Método utilizado para excluir um objeto LocadorDTO no banco de dados
     *
     * @param locadorDTO que vem da classe LocadorCTR
     * @return Um boolean 
     */
    public boolean excluirLocador(LocadorDTO locadorDTO) {
        String comando = "";
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            
            comando = "Delete from Locador " +
                      "Where id_pes = " + locadorDTO.getId_pes();
           
            stmt.execute(comando);
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            
            if(this.excluirPessoa(locadorDTO)){
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
    }//Fecha o método excluirLocador
    

    /**
     * Método utilizado para consultar um objeto LocadorDTO no banco de dados
     * @param locadorDTO que vem da classe LocadorCTR
     * @param opcao que vem da classe LocadorCTR
     * @return Um ResultSet com os dados do locador
     */
    public ResultSet consultarLocador(LocadorDTO locadorDTO, int opcao) {
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
                              "from Pessoa p, Locador l " + 
                              "where l.id_pes = p.id_pes and " +
                              "p.nom_pes like '" + locadorDTO.getNom_pes() + "%' " +
                              "order by p.nom_pes";
                    break;
                    
                case 2: //Pesquisa por id
                    comando = "Select p.*, to_char(l.val_cnh_loc, 'DD/MM/YYYY') as validade_cnh " +
                              "from Pessoa p, Locador l " + 
                              "where l.id_pes = p.id_pes and " +
                              "p.id_pes = " + locadorDTO.getId_pes();
                    
            }//fecha switch opcao
            //Executa o comando SQL no banco de Dados
            rs = stmt.executeQuery(comando.toUpperCase());

            return rs;

        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }//Fecha o método consultarLocador

    
}//Fecha a classe LocadorDAO
