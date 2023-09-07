package Exercicio_02;

public class AlunoCTR {
    AlunoDAO alunoDAO = new AlunoDAO();
    
    public String mostraDadosAluno(AlunoDTO alunoDTO){
        return alunoDAO.mostraDadosAluno(alunoDTO);
    }    
}
