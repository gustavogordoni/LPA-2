package F_Encapsulamento_Ex09;

public class AlturaDAO {
    // private String mensagem;
    private String res;
    
    public String mostrarResposta(AlturaDTO alturaDTO){           
        
    if (alturaDTO.getAltura() < 1.20){
            if (alturaDTO.getPeso() <= 60){
                this.res = "A";
            }
            else{
                if ((alturaDTO.getPeso() > 60)&&(alturaDTO.getPeso() <= 90)){
                this.res = "D";
                }
                else{
                this.res = "G";
                }
            }    
	}
	else{
            if ((alturaDTO.getAltura() >= 1.20)&&(alturaDTO.getAltura() < 1.70)){
                if (alturaDTO.getPeso() <= 60){
                    this.res = "B";
                }
                else{
                    if ((alturaDTO.getPeso() > 60)&&(alturaDTO.getPeso() <= 90)){
                    this.res = "E";
                    }
                    else{
                    this.res = "H";
                    }
                }    
            }
            else{
                if (alturaDTO.getAltura() >= 1.70){
                    if (alturaDTO.getPeso() <= 60){
                        this.res = "C";
                    }
                    else{
                        if ((alturaDTO.getPeso() > 60)&&(alturaDTO.getPeso() <= 90)){
                        this.res = "F";
                        }
                        else{
                        this.res = "I";
                        }
                    }   
                }        
            } 
	}
        return "A classificação é: " + this.res;   
        
    }
}    