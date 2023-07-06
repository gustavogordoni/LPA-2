package A_Introducao_Ex05;

public class Salario {
    
    private double sal, salf, grat;
    
    public Double calcularSalario(double sal){
        this.sal = sal;
         
        this.grat = this.sal - (this.sal * 0.1);
        this.salf = this.grat + 50;
        
        return salf;      
    }  
}
