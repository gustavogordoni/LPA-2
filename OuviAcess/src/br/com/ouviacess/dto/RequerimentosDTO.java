package br.com.ouviacess.dto;

public class RequerimentosDTO {
    //private String resposta, titulo, tipo, situacao, data, descricao, cep, cidade, bairro, rua;
    //private int id_requerimento, id_usuario;
    
    private String resposta, situacao;
    private int id_administrador, id_requerimento;    

    public int getId_requerimento() {
        return id_requerimento;
    }

    public void setId_requerimento(int id_requerimento) {
        this.id_requerimento = id_requerimento;
    }

    public int getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(int id_administrador) {
        this.id_administrador = id_administrador;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
