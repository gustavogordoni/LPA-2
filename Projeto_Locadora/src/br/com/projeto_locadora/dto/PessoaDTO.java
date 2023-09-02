package br.com.projeto_locadora.dto;


/**
 * Essa classe contém os métodos para manipular os atributos de Pessoa
 * Disciplina de LPA - Integrado IFSP
 *
 * @author Andre Luis Gobbi Primo/Marcelo Luis Murari
 * @version 2.0
 */
public class PessoaDTO {
    private String cpf_cnpj_pes, rg_ie_pes, nom_pes, end_pes, bai_pes, cid_pes, est_pes, cep_pes;
    private int id_pes, num_pes, tip_pes;
    
    
    /**
     * Método construtor padrão
     */
    public PessoaDTO (){
    }
    
    /**
     * Retorna identificador da pessoa
     * @return id_pes, um Integer contendo identificador
     */
    public int getId_pes() {
        return id_pes;
    }

    /**
     * Recebe identificador da pessoa
     * @param id_pes, do pessoa
     */
    public void setId_pes(int id_pes) {
        this.id_pes = id_pes;
    }

    /**
     * Retorna cpf/cnpj da pessoa
     * @return cpf_cnpj_pes, uma String contendo cpf/cnpj
     */
    public String getCpf_cnpj_pes() {
        return cpf_cnpj_pes;
    }

    /**
     * Recebe cpf/cnpj da pessoa
     * @param cpf_cnpj_pes, da pessoa
     */
    public void setCpf_cnpj_pes(String cpf_cnpj_pes) {
        this.cpf_cnpj_pes = cpf_cnpj_pes;
    }

    /**
     * Retorna rg/ie da pessoa
     * @return rg_ie_pes, uma String contendo rg/ie
     */
    public String getRg_ie_pes() {
        return rg_ie_pes;
    }

    /**
     * Recebe rg/ie da pessoa
     * @param rg_ie_pes, da pessoa
     */
    public void setRg_ie_pes(String rg_ie_pes) {
        this.rg_ie_pes = rg_ie_pes;
    }

    /**
     * Retorna nome da pessoa
     * @return nom_pes, uma String contendo nome
     */
    public String getNom_pes() {
        return nom_pes;
    }

    /**
     * Recebe nome da pessoa
     * @param nom_pes, da pessoa
     */
    public void setNom_pes(String nom_pes) {
        this.nom_pes = nom_pes;
    }

    /**
     * Retorna endereco da pessoa
     * @return end_pes, uma String contendo endereco
     */
    public String getEnd_pes() {
        return end_pes;
    }

    /**
     * Recebe edereco da pessoa
     * @param end_pes, da pessoa
     */
    public void setEnd_pes(String end_pes) {
        this.end_pes = end_pes;
    }

    /**
     * Retorna bairro da pessoa
     * @return bai_pes, uma String contendo bairro
     */
    public String getBai_pes() {
        return bai_pes;
    }

    /**
     * Recebe bairro da pessoa
     * @param bai_pes, da pessoa
     */
    public void setBai_pes(String bai_pes) {
        this.bai_pes = bai_pes;
    }

    /**
     * Retorna cidade da pessoa
     * @return cid_pes, uma String contendo cidade
     */
    public String getCid_pes() {
        return cid_pes;
    }

    /**
     * Recebe cidade da pessoa
     * @param cid_pes, da pessoa
     */
    public void setCid_pes(String cid_pes) {
        this.cid_pes = cid_pes;
    }

    /**
     * Retorna estado da pessoa
     * @return est_pes, uma String contendo estado
     */
    public String getEst_pes() {
        return est_pes;
    }

    /**
     * Recebe estado da pessoa
     * @param est_pes, da pessoa
     */
    public void setEst_pes(String est_pes) {
        this.est_pes = est_pes;
    }
    
    /**
     * Retorna cep da pessoa
     * @return cep_pes, uma String contendo cep
     */
    public String getCep_pes() {
        return cep_pes;
    }

    /**
     * Recebe cep da pessoa
     * @param cep_pes, da pessoa
     */
    public void setCep_pes(String cep_pes) {
        this.cep_pes = cep_pes;
    }

    /**
     * Retorna numero da residencia da pessoa
     * @return num_pes, um Integer contendo numero da residencia
     */
    public int getNum_pes() {
        return num_pes;
    }

    /**
     * Recebe numero da residencia da pessoa
     * @param num_pes, da pessoa
     */
    public void setNum_pes(int num_pes) {
        this.num_pes = num_pes;
    }

    /**
     * Retorna o tipo da pessoa 1-Funcionario | 2-Locador
     * @return tip_pes, um Integer contendo tipo da pessoa
     */
    public int getTip_pes() {
        return tip_pes;
    }

    /**
     * Recebe tipo da pessoa
     * @param tip_pes, da pessoa
     */
    public void setTip_pes(int tip_pes) {
        this.tip_pes = tip_pes;
    }
    
}//Fecha classe PessoaDTO
