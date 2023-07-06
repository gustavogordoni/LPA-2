package C_FOR_Ex05;

public class Salario{
    
    private int ano;
    private double sal,salf, por;
    
    public double calcular (int ano){   
  
        this.ano = ano;
        
        this.salf = 1015;
        this.por = 0.015;
      
        for (int cont = 1997; cont <= ano; cont++){
            this.por = this.por * 2;
            this.salf = (this.salf* this.por) + this.salf;
        } 
        
        return this.salf;
                
    }
  
}// Fecha chave