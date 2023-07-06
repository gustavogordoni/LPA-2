package B_IF_Ex04;

public class Classificacao{
    
    private double altura, peso;
    private String res;
    
    public String calcular (double altura, double peso){   
  
        this.altura = altura;
        this.peso = peso;
        
	if (this.altura < 1.20){
            if (this.peso <= 60){
                this.res = "A";
            }
            else{
                if ((this.peso > 60)&&(this.peso <= 90)){
                this.res = "D";
                }
                else{
                this.res = "G";
                }
            }    
	}
	else{
            if ((this.altura > 1.20)&&(this.altura < 1.70)){
                if (this.peso <= 60){
                    this.res = "B";
                }
                else{
                    if ((this.peso > 60)&&(this.peso <= 90)){
                    this.res = "E";
                    }
                    else{
                    this.res = "H";
                    }
                }    
            }
            else{
                if (this.altura > 1.70){
                    if (this.peso <= 60){
                        this.res = "C";
                    }
                    else{
                        if ((this.peso > 60)&&(this.peso <= 90)){
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
}// Fecha chave