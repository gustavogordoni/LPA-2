package Exercicio_02;

public class AlunoDAO extends PessoaDAO{
    public String mostraDadosAluno(AlunoDTO alunoDTO){
        return mostraDadosPessoa(alunoDTO) + 
                "\n Prontuário: " + alunoDTO.getProntuario() +
                "\n Curso: " + alunoDTO.getCurso();                
    }    
    
}
