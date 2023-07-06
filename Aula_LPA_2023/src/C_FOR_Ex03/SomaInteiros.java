package C_FOR_Ex03;

public class SomaInteiros {
    
    private int soma;
    private int n;
    
    public void calcular (int n){   
  
        this.n = n;
        
        this.soma = this.soma + this.n;    
    }
    
    public int resposta (){   
        return this.soma;
    }

}// Fecha chave