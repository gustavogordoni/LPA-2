package A_Introducao_Ex09;

public class Racao {
    
    private double saco, gato1, gato2, conv, resto;
   
    public double calcularRacao(double saco, double gato1, double gato2){
        this.saco = saco;
        this.gato1 = gato1;
        this.gato2 = gato2;
        
        this.conv = (this.gato1 + this.gato2) /1000;
        this.resto = this.saco - (this.conv * 5);   
      
        return this.resto;
    }  
}