package A_Introducao_Ex04;

public class Salario {
    
    private double sal, vend, salf, comisf;
    
    public String calcularSalario(double sal, double vend){
       
        this.sal = sal;
        this.vend = vend;
         
        this.comisf = this.vend * 0.04;
        this.salf = this.sal + this.comisf;
        
        return "O valor da comissão é: " + this.comisf + 
                "\nO valor do salário final é: " + this.salf;      
    }  
}
