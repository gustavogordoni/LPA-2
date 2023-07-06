package A_Introducao_Ex10;


public class Quilowatt {
    
    private double salmin, watts, cada, tudo, desconto;
    
    public String calcularEnergia (double salmin, double watts){   
  
        this.salmin = salmin;
        this.watts = watts;
        
        this.cada = this.salmin / 5;
        this.tudo = this.cada * this.watts;
        this.desconto = this.tudo - (this.tudo * 0.15);
        
        
        return "O valor de cada quilowatt é: " + this.cada + " reais" + 
                "\nO valor a ser pago pela residência: " + this.tudo + " reais" + 
                "\nO valor a ser pago com desconto de 15%: " + this.desconto + " reais";
    }
  
}