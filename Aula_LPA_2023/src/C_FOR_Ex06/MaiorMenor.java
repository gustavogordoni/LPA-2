package C_FOR_Ex06;

public class MaiorMenor{
    
    private int n, maior, menor;
    
    public void calcular (int n){   
  
        this.n = n;   
        
	if ((this.menor == 0) && (this.maior == 0)){
            this.maior = this.n;
            this.menor = this.n;
	}
	if(n > maior){
            this.maior = this.n;
        }
        if(n < menor){
            this.menor = this.n;
        }
    }
    
    public String resposta (){   
        return "O maior número é: " + this.maior + "\n" 
                + "O menor número é: " + this.menor;
    }
}// Fecha chave