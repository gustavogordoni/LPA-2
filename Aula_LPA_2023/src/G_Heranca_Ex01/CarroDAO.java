package G_Heranca_Ex01;

public class CarroDAO extends VeiculoDAO {
    
    public String imprimirPotencia (CarroDTO carroDTO){
        return "A Placa é: " + carroDTO.getPotencia();
    }
    
    public String imprimirQtd_portas (CarroDTO carroDTO){
        return "A Quantidade de portas é: " + carroDTO.getQtd_portas();
    }    
}
