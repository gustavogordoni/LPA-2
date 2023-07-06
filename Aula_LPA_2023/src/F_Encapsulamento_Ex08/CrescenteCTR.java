package F_Encapsulamento_Ex08;

public class CrescenteCTR {
    CrescenteDAO crescenteDAO = new CrescenteDAO();

    public String mostrarResposta(CrescenteDTO crescenteDTO){
        return crescenteDAO.mostrarResposta(crescenteDTO);
    }
}
