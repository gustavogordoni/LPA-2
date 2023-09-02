package br.com.projeto_locadora.dao;

/**
 * Importando as classes necessárias para trabalhar nesta classe
 */
import br.com.projeto_locadora.dto.LocacaoDTO;
import br.com.projeto_locadora.dto.CarroDTO;
import br.com.projeto_locadora.dto.LocadorDTO;
import java.sql.*;

/**
 * Essa classe contém os métodos para inserir, alterar, consultar e excluir 
 * Locacao
 * Disciplina de LPA - Integrado IFSP
 *
 * @author Andre Luis Gobbi Primo/Marcelo Luis Murari
 * @version 2.0
 */
public class LocacaoDAO{
    

    /**
     * Método construtor da classe
     */
    public LocacaoDAO() {
    }

    //Atributo do tipo ResultSet utilizado para realizar consultas
    private ResultSet rs = null;
    //Manipular o banco de dados
    private Statement stmt = null;
    
      
    /**
     * Método utilizado para inserir um objeto LocadorDTO no banco de dados
     *
     * @param locacaoDTO que vem da classe LocacaoCTR
     * @param carroDTO que vem da classe LocacaoCTR
     * @param locadorDTO que vem da classe LocacaoCTR
     * @return Um boolean 
     */
    public boolean inserirLocacao(LocacaoDTO locacaoDTO, CarroDTO carroDTO, LocadorDTO locadorDTO) {
        String comando = "";
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            
            comando = "Insert into Locacao (dat_ini_locacao, "
                    + "km_ini_locacao, id_car, id_pes) values ("
                    + "to_date('" + locacaoDTO.getDat_ini_locacao()+ "', 'YYYY-MM-DD'), "
                    + locacaoDTO.getKm_ini_locacao()+ ", "
                    + carroDTO.getId_car()+ ", "
                    + locadorDTO.getId_pes()+ ")";
            System.out.println(comando);
            stmt.execute(comando);
            
            ConexaoDAO.con.commit();
            //Fecha o statement
            stmt.close();
            return true;
        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo. //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println("Erro LocacaoDAO" + e.getMessage());
            return false;
        } //Independente de dar erro ou não ele vai fechar o banco de dados.
        finally {
            //Chama o metodo da classe ConexaoDAO para fechar o banco de dados
            ConexaoDAO.CloseDB();
        }
    }//Fecha o método inserirLocacao
    
    
    /**
     * Método utilizado para alterar um objeto LocacaoDTO no banco de dados
     *
     * @param locacaoDTO que vem da classe LocacaoCTR
     * @return Um boolean 
     */
    public boolean alterarLocacao(LocacaoDTO locacaoDTO) {
        String comando = "";
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            comando = "Update Locacao set "
                    + "dat_fim_locacao = to_date('" + locacaoDTO.getDat_fim_locacao()+ "', 'YYYY-MM-DD'), "
                    + "km_fim_locacao = " + locacaoDTO.getKm_fim_locacao()+ ", "
                    + "obs_locacao = " + locacaoDTO.getObs_locacao()+ " "
                    + "where id_locacao = " + locacaoDTO.getId_locacao();

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
    }//Fecha o método aletarLocacao

    
    /**
     * Método utilizado para consultar um objeto LocacaoDTO no banco de dados
     * @param locacaoDTO que vem da classe LocacaoCTR
     * @param carroDTO que vem da classe LocacaoCTR
     * @param opcao que vem da classe LocacaoCTR
     * @return Um ResultSet com os dados do locador
     */
    public ResultSet consultarLocacao(LocacaoDTO locacaoDTO, CarroDTO carroDTO, int opcao) {
        try {
            //Chama o metodo que esta na classe ConexaoDAO para abrir o banco de dados
            ConexaoDAO.ConectDB();
            //Cria o Statement que responsavel por executar alguma coisa no banco de dados
            stmt = ConexaoDAO.con.createStatement();
            //Comando SQL que sera executado no banco de dados
            String comando="";
            
            switch(opcao){
                case 1: //Pesquisa por nome
                    comando = "Select l.*, c.pla_car " +
                              "from Locacao l, Carro c " + 
                              "where l.id_car = c.id_car and " +
                              "l.dat_fim_locacao is null and " +
                              "l.km_fim_locacao is null and " +
                              "c.pla_car like '" + carroDTO.getPla_car()+ "%' " +
                              "order by c.pla_car";
                    break;
                    
                case 2: //Pesquisa por id
                    comando = "Select p.nom_pes, l.*, c.*, " +
                              "to_char(l.dat_ini_locacao, 'DD/MM/YYYY') as data_inicial, " +
                              "to_char(l.dat_fim_locacao, 'DD/MM/YYYY') as data_final " +
                              "from Locacao l, Pessoa p, Carro c " + 
                              "where l.id_pes = p.id_pes and " +
                              "l.id_car = c.id_car and " +
                              "l.id_locacao = " + locacaoDTO.getId_locacao();
                    break;
                    
            }//fecha switch opcao
            //Executa o comando SQL no banco de Dados
            System.out.println(comando);
            rs = stmt.executeQuery(comando.toUpperCase());

            return rs;

        } //Caso tenha algum erro no codigo acima é enviado uma mensagem no console com o que esta acontecendo.
        catch (Exception e) {
            System.out.println(e.getMessage());
            return rs;
        }
    }//Fecha o método consultarLocacao
    
}//Fecha a classe LocacaoDAO
