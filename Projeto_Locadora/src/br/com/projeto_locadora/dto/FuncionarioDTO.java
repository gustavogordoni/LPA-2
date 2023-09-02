package br.com.projeto_locadora.dto;

/**
 * Essa classe contém os métodos para manipular os atributos de Funcionario
 * Disciplina de LPA - Integrado IFSP
 *
 * @author Andre Luis Gobbi Primo/Marcelo Luis Murari
 * @version 2.0
 */
public class FuncionarioDTO extends PessoaDTO{
    private String log_fun, sen_fun;
    
    /**
     * Método construtor padrão
     */
    public FuncionarioDTO (){
    }
    
    /**
     * Retorna login do funcionario
     * @return log_fun, uma String contendo login
     */
    public String getLog_fun() {
        return log_fun;
    }

    /**
     * Recebe login do funcionario
     * @param log_fun, do funcionario
     */
    public void setLog_fun(String log_fun) {
        this.log_fun = log_fun;
    }

    /**
     * Retorna senha do funcionario
     * @return sen_fun, uma String contendo sena
     */
    public String getSen_fun() {
        return sen_fun;
    }

    /**
     * Recebe senha do funcionario
     * @param sen_fun, do funcionario
     */
    public void setSen_fun(String sen_fun) {
        this.sen_fun = sen_fun;
    }

    
}//Fecha classe FuncionarioDTO
