package br.com.projeto_locadora.dto;

import java.util.Date;

/**
 * Essa classe contém os métodos para manipular os atributos de Lcoacao
 * Disciplina de LPA - Integrado IFSP
 *
 * @author Andre Luis Gobbi Primo/Marcelo Luis Murari
 * @version 2.0
 */
public class LocacaoDTO {
    private String obs_locacao;
    private int id_locacao, km_ini_locacao, km_fim_locacao;
    private Date dat_ini_locacao, dat_fim_locacao;
    
    /**
     * Retorna observacao da locacao
     * @return obs_locacao, uma String contendo observacao
     */
    public String getObs_locacao() {
        return obs_locacao;
    }

    /**
     * Recebe observacao da locacao
     * @param obs_locacao, da locacao
     */
    public void setObs_locacao(String obs_locacao) {
        this.obs_locacao = obs_locacao;
    }

    /**
     * Retorna identificador da locacao
     * @return id_locacao, um Integer contendo identificador
     */
    public int getId_locacao() {
        return id_locacao;
    }

    /**
     * Recebe identificador da locacao
     * @param id_locacao, da locacao
     */
    public void setId_locacao(int id_locacao) {
        this.id_locacao = id_locacao;
    }

    /**
     * Retorna km inicial da locacao
     * @return km_ini_locacao, um Integer contendo km inicial
     */
    public int getKm_ini_locacao() {
        return km_ini_locacao;
    }

    /**
     * Recebe km inicial da locacao
     * @param km_ini_locacao, da locacao
     */
    public void setKm_ini_locacao(int km_ini_locacao) {
        this.km_ini_locacao = km_ini_locacao;
    }

    /**
     * Retorna km final da locacao
     * @return km_fim_locacao, um Integer contendo km final
     */
    public int getKm_fim_locacao() {
        return km_fim_locacao;
    }

    /**
     * Recebe km final da locacao
     * @param km_fim_locacao, da locacao
     */
    public void setKm_fim_locacao(int km_fim_locacao) {
        this.km_fim_locacao = km_fim_locacao;
    }

    /**
     * Retorna data inicial da locacao
     * @return dat_ini_locacao, uma Date contendo data inicial
     */
    public Date getDat_ini_locacao() {
        return dat_ini_locacao;
    }

    /**
     * Recebe data incial da locacao
     * @param dat_ini_locacao, da locacao
     */
    public void setDat_ini_locacao(Date dat_ini_locacao) {
        this.dat_ini_locacao = dat_ini_locacao;
    }

    /**
     * Retorna data final da locacao
     * @return dat_fim_locacao, uma Date contendo data final
     */
    public Date getDat_fim_locacao() {
        return dat_fim_locacao;
    }

    /**
     * Recebe data final da locacao
     * @param dat_fim_locacao, da locacao
     */
    public void setDat_fim_locacao(Date dat_fim_locacao) {
        this.dat_fim_locacao = dat_fim_locacao;
    }

}//Fecha classe LocacaoDTO
