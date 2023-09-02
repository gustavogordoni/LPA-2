package br.com.projeto_locadora.dto;

/**
 * Essa classe contém os métodos para manipular os atributos de Carro
 * Disciplina de LPA - Integrado IFSP
 *
 * @author Andre Luis Gobbi Primo/Marcelo Luis Murari
 * @version 2.0
 */
public class CarroDTO {
    private String pla_car, mar_car, des_car;
    private int id_car, ano_car;
    
    
    /**
     * Método construtor padrão
     */
    public CarroDTO (){
    }
    
    /**
     * Método construtor alterado para pode preencher o cambo de seleção de carro na tela de LocacaoVIEW
     * @param id_car
     * @param pla_car 
     */
    public CarroDTO (int id_car, String pla_car){
      this.id_car=id_car;
      this.pla_car=pla_car;
    }
    
    
    /**
     * Retorna placa do carro
     * @return pla_car, uma String contendo placa
     */
    public String getPla_car() {
        return pla_car;
    }

    /**
     * Recebe placa do carro
     * @param pla_car, do carro
     */
    public void setPla_car(String pla_car) {
        this.pla_car = pla_car;
    }

    /**
     * Retorna marca do carro
     * @return mar_car, uma String contendo marca
     */
    public String getMar_car() {
        return mar_car;
    }

    /**
     * Recebe marca do carro
     * @param mar_car, do carro
     */
    public void setMar_car(String mar_car) {
        this.mar_car = mar_car;
    }

    /**
     * Retorna descricao do carro
     * @return des_car, uma String contendo descricao
     */
    public String getDes_car() {
        return des_car;
    }

    /**
     * Recebe descricao do carro
     * @param des_car, do carro
     */
    public void setDes_car(String des_car) {
        this.des_car = des_car;
    }

    /**
     * Retorna identidicador do carro
     * @return id_car, um Integer contendo identificador
     */
    public int getId_car() {
        return id_car;
    }

    /**
     * Recebe identificador do carro
     * @param id_car, do carro
     */
    public void setId_car(int id_car) {
        this.id_car = id_car;
    }

    /**
     * Retorna ano do carro
     * @return ano_car, um INteger contendo ano
     */
    public int getAno_car() {
        return ano_car;
    }

    /**
     * Recebe ano do carro
     * @param ano_car, do carro
     */
    public void setAno_car(int ano_car) {
        this.ano_car = ano_car;
    }

    
}//Fecha classe CarroDTO
