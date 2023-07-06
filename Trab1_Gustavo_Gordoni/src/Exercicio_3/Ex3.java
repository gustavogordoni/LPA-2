package Exercicio_3;

public class Ex3{
    
    private double n1, vista, prazo;
    
    public String calcular (double n1){   
  
        this.n1 = n1;
        
        this.vista = this.n1 - (this.n1 * 0.05);
        this.prazo = this.n1 + (this.n1 * 0.1);
               
        return "O preço à vista é: R$" + this.vista +
                "\nO preço à prazo é: R$" + + this.prazo; 
                
    }
  
}// Fecha 2