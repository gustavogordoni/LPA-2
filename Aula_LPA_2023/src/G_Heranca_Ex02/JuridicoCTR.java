package G_Heranca_Ex02;

public class JuridicoCTR {
    JuridicoDAO juridicoDAO = new JuridicoDAO();
    
    public String mostraDadosCli(JuridicoDTO juridicoDTO){
        return juridicoDAO.mostraDadosCli(juridicoDTO);
    }
    
    public String mostraDadosJuri(JuridicoDTO juridicoDTO){
        return juridicoDAO.mostraDadosJuri(juridicoDTO);
    }
}
