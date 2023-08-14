package G_Heranca_Ex01;

public class MotoCTR {
    MotoDAO motoDAO = new MotoDAO();

    public String imprimirCor(MotoDTO motoDTO){
        return motoDAO.imprimirCor(motoDTO);
    }

    public String imprimirPlaca(MotoDTO motoDTO) {
        return motoDAO.imprimirPlaca(motoDTO);
    }
    
    public String imprimirCilindrada(MotoDTO motoDTO) {
        return motoDAO.imprimirCilindrada(motoDTO);
    }
    
    public String imprimirTipo_motor(MotoDTO motoDTO) {
        return motoDAO.imprimirTipo_motor(motoDTO);
    }    
}
