package F_Encapsulamento_Ex04;

public class NotasDAO {
    private double media;
    
    public String mostrarResposta(NotasDTO notasDTO){
        this.media = (notasDTO.getN1() + notasDTO.getN2()) / 2;
        
        if (this.media >= 7){
            return "O aluno foi aprovado \n " + 
                    "Média: " + this.media;
        }
        else{
            return "O aluno não foi aprovado \n " + 
                    "Média: " + this.media;
        }
       
    }
       
    
}