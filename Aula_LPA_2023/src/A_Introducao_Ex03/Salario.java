package A_Introducao_Ex03;

public class Salario {
    private double sal, porc, salf;
    
    public double calcularSalario(double sal, double porc){
       
        this.sal = sal;
        this.porc = porc;
         
        this.salf = this.sal + (this.porc * this.sal / 100); 
        
        return salf;
    }
    
}
