package A_Introducao_Ex08;

public class Salario {
    
    private double hrs, min, salf, val_hrs, salb, imp;
   
    public double calcularSalario(double hrs,double min){
        this.hrs = hrs;
        this.min = min;
        
        this.val_hrs = this.min / 2;
        this.salb = this.hrs * val_hrs;
        this.imp = this.salb * 0.03;
        this.salf = this.salb - this.imp ;
        
   
        return this.salf ;
    }  
}