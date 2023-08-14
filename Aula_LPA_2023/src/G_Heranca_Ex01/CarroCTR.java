package G_Heranca_Ex01;

public class CarroCTR {
    CarroDAO carroDAO = new CarroDAO();

    public String imprimirCor(CarroDTO carroDTO){
        return carroDAO.imprimirCor(carroDTO);
    }

    public String imprimirPlaca(CarroDTO carroDTO){
        return carroDAO.imprimirPlaca(carroDTO);
    }
    
    public String imprimirPotencia(CarroDTO carroDTO){
        return carroDAO.imprimirPotencia(carroDTO);
    }
    
    public String imprimirQtd_portas(CarroDTO carroDTO){
        return carroDAO.imprimirQtd_portas(carroDTO);
    } 
    
}
