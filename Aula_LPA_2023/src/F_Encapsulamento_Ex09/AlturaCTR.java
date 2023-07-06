package F_Encapsulamento_Ex09;

public class AlturaCTR {
    AlturaDAO alturaDAO = new AlturaDAO();

    public String mostrarResposta(AlturaDTO alturaDTO){
        return alturaDAO.mostrarResposta(alturaDTO);
    }
}