package F_Encapsulamento_Ex07;

public class DecrescenteCTR {
    DecrescenteDAO decrescenteDAO = new DecrescenteDAO();

    public String mostrarResposta(DecrescenteDTO decrescenteDTO){
        return decrescenteDAO.mostrarResposta(decrescenteDTO);
    }
}
