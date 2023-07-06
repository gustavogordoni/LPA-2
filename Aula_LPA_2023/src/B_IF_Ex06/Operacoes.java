package B_IF_Ex06;

public class Operacoes{
    
    private double resultado;
    private int n1, n2;
    private String op;
    
    public double calcular (int n1,int n2, String op){   
  
        this.n1 = n1;
        this.n2 = n2;
        this.op = op;
        
        switch (this.op){
            case "A": 
                this.resultado = this.n1 + this.n2;
                break;
            case "S": 
                this.resultado = this.n1 - this.n2;
                break;
            case "M": 
                this.resultado = this.n1 * this.n2;
                break;
            case "D": 
                this.resultado = this.n1 / this.n2;
                break;
            default: 
                this.resultado = 0;
        }
        
        return this.resultado;
    }
  
}// Fecha chave