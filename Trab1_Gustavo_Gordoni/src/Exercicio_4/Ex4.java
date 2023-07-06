package Exercicio_4;

public class Ex4{
    
    private double horas, salmin, extra;
    private double valorhora, valorextra, bruto, receberextra, salario;
    
    
    public double calcular (double horas, double salmin, double extra){   
  
        this.horas = horas;
        this.salmin = salmin;
        this.extra = extra;
        
        this.valorhora = this.salmin / 8;
        this.valorextra = this.salmin / 4;
        this.bruto = this.horas * this.valorhora;
        this.receberextra = this.extra * this.valorextra;
        this.salario = this.bruto + this.receberextra;
               
        return this.salario; 
                
    }
  
}// Fecha 2