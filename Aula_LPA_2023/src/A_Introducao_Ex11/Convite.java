package A_Introducao_Ex11;


public class Convite {
    
    private double custo, preco, qnt_convite;
    
    public String calcular (double custo, double preco){   
  
        this.custo = custo;
        this.preco = preco;
        
        this.qnt_convite = this.custo / this.preco;
        
        
        return "A quantidade de convites: " + this.qnt_convite;
    }
  
}// Fecha chave