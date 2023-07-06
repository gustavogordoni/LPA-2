package Exercicio_5;

public class Ex5{
    
    private double reais ,dolar, euro, libra;
    
    
    public String calcular (double reais){   
  
        this.reais = reais;
        
        this.dolar = this.reais / 5.25;
        this.euro = this.reais / 5.66;
        this.libra = this.reais / 6.42;
        
               
        return "Valor em Dólares: " + this.dolar + 
                "\nValor em Euros: " + this.euro + 
                "\nValor em Libras: " + this.libra; 
                
    }
  
}// Fecha 2