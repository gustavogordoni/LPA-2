package G_Heranca_Ex01;

public class MotoDAO extends VeiculoDAO {
    
    public String imprimirCilindrada (MotoDTO motoDTO){
        return "A Cilindrada é: " + motoDTO.getCilindrada();
    }
    
    public String imprimirTipo_motor (MotoDTO motoDTO){
        return "O Tipo do Motor é: " + motoDTO.getTipo_motor();
    }   
}