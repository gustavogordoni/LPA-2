package F_Encapsulamento_Ex04;

public class NotasCTR {
    NotasDAO notasDAO = new NotasDAO();

    public String mostrarResposta(NotasDTO notasDTO){
        return notasDAO.mostrarResposta(notasDTO);
    }
}
