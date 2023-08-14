package G_Heranca_Ex02;

public class FisicoCTR {
    FisicoDAO fisicoDAO = new FisicoDAO();
    
    public String mostraDadosCli(FisicoDTO fisicoDTO){
        return fisicoDAO.mostraDadosCli(fisicoDTO);
    }
    
    public String mostraDadosFisi(FisicoDTO fisicoDTO){
        return fisicoDAO.mostraDadosFisi(fisicoDTO);
    }
}
