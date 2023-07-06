package F_Encapsulamento_Ex05;

public class SoloCTR {
    SoloDAO soloDAO = new SoloDAO();

    public String mostrarResposta(SoloDTO soloDTO){
        return soloDAO.mostrarResposta(soloDTO);
    }
}
