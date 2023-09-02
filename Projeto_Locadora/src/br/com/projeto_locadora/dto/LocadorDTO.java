package br.com.projeto_locadora.dto;

import java.util.Date;

/**
 * Essa classe contém os métodos para manipular os atributos de Locador
 * Disciplina de LPA - Integrado IFSP
 *
 * @author Andre Luis Gobbi Primo/Marcelo Luis Murari
 * @version 2.0
 */
public class LocadorDTO extends PessoaDTO {
    private Date val_cnh_loc;
    
    /**
     * Método construtor padrão
     */
    public LocadorDTO (){
    }
    
    /**
     * Retorna validade da cnh do locador
     * @return val_cnh_loc, uma String contendo validade da cnh
     */
    public Date getVal_cnh_loc() {
        return val_cnh_loc;
    }

    /**
     * Recebe validade da cnh do locador
     * @param val_cnh_loc, do locador
     */
    public void setVal_cnh_loc(Date val_cnh_loc) {
        this.val_cnh_loc = val_cnh_loc;
    }

    
}//Fecha classe LocadorDTO
