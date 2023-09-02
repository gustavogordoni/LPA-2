package br.com.projeto_locadora.dao;

/**
 * Importando as classes necessárias para trabalhar nesta classe
 */

import br.com.projeto_locadora.dto.PessoaDTO;
import java.sql.*;

/**
 * Essa classe contém os métodos para inserir, alterar, consultar e excluir
 * Pessoa e seus filhos (funcionario e locador)
 * Disciplina de LPA - Integrado IFSP
 *
 * @author Andre Luis Gobbi Primo/Marcelo Luis Murari
 * @version 2.0
 */
public class PessoaDAO {
    

    /**
     * Método construtor da classe
     */
    public PessoaDAO() {
    }

    //Atributo do tipo ResultSet utilizado para realizar consultas
    private ResultSet rs = null;
    //Manipular o banco de dados
    private Statement stmt = null;
    
      
    /**
     * Método utilizado para inserir um objeto PessoaDTO no banco de dados
     *
     * @param pessoaDTO que vem da classe PessoaCTR
     * @return Um boolean 
     */
    public int inserirPessoa(PessoaDTO pessoaDTO) {
        String comando = "";
        int id_pes=0;
        try {
            
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            comando = "Insert into Pessoa (cpf_cnpj_pes, rg_ie_pes, "
                    + "nom_pes, end_pes, num_pes, "
                    + "bai_pes, cid_pes, est_pes, cep_pes, tip_pes) values ("
                    + "'" + pessoaDTO.getCpf_cnpj_pes() + "', "
                    + "'" + pessoaDTO.getRg_ie_pes() + "', "
                    + "'" + pessoaDTO.getNom_pes() + "', "
                    + "'" + pessoaDTO.getEnd_pes() + "', "
                    + pessoaDTO.getNum_pes() + ", "
                    + "'" + pessoaDTO.getBai_pes() + "', "
                    + "'" + pessoaDTO.getCid_pes() + "', "
                    + "'" + pessoaDTO.getEst_pes() + "', "
                    + "'" + pessoaDTO.getCep_pes() + "', "
                    + pessoaDTO.getTip_pes() + ")";
            System.out.println(comando);
            stmt.execute(comando.toUpperCase(), Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            rs.next();
            id_pes = rs.getInt("id_pes");
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            rs.close();
            return id_pes;
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println("Erro PessoaDAO" + e.getMessage());
            return id_pes;
        } //Independente de dar erro ou não ele vai fechar o banco de dados.
        finally {
            //Chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }
    }//Fecha o método inserirPessoa
    
    
    /**
     * Método utilizado para alterar um objeto PessoaDTO no banco de dados
     *
     * @param pessoaDTO que vem da classe PessoaCTR
     * @return Um boolean 
     */
    public boolean alterarPessoa(PessoaDTO pessoaDTO) {
        String comando = "";
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            comando = "Update Pessoa set "
                    + "cpf_cnpj_pes = '" + pessoaDTO.getCpf_cnpj_pes() + "', "
                    + "rg_ie_pes = '" + pessoaDTO.getRg_ie_pes() + "', "
                    + "nom_pes = '" + pessoaDTO.getNom_pes() + "', "
                    + "end_pes = '" + pessoaDTO.getEnd_pes() + "', "
                    + "num_pes = " + pessoaDTO.getNum_pes() + ", "
                    + "bai_pes = '" + pessoaDTO.getBai_pes() + "', "
                    + "cid_pes = '" + pessoaDTO.getCid_pes() + "', "
                    + "est_pes = '" + pessoaDTO.getEst_pes() + "', "
                    + "cep_pes = '" + pessoaDTO.getCep_pes() + "' "
                    + "where id_pes = " + pessoaDTO.getId_pes();
                   
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            return true;
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println("Erro PessoaDAO" +e.getMessage());
            return false;
        } //Independente de dar erro ou não ele vai fechar o banco de dados.
        finally {
            //Chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }
    }//Fecha o método aletarPessoa

   
    /**
     * Método utilizado para excluir um objeto PessoaDTO no banco de dados
     *
     * @param pessoaDTO que vem da classe PessoaCTR
     * @return Um boolean 
     */
    public boolean excluirPessoa(PessoaDTO pessoaDTO) {
        try {
            String comando = "";
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            
            comando = "Delete from Pessoa "+
                      "where id_pes = " + pessoaDTO.getId_pes();
            
            stmt.execute(comando);
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
    }//Fecha o método excluirPessoa
    
  
}//Fecha a classe PessoaDAO
