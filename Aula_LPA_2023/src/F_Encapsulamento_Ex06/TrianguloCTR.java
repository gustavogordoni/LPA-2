package F_Encapsulamento_Ex06;

public class TrianguloCTR {
    TrianguloDAO trianguloDAO = new TrianguloDAO();

    public String mostrarResposta(TrianguloDTO trianguloDTO){
        return trianguloDAO.mostrarResposta(trianguloDTO);
    }
}
