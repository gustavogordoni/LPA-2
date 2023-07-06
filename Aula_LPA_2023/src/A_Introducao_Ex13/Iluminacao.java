package A_Introducao_Ex13;


public class Iluminacao {
    
    private double comprimento, largura, area, iluminacao;
    
    public String calcularIlu (double comprimento, double largura){   
  
        this.comprimento = comprimento;
        this.largura = largura;
        
        this.area = this.comprimento *  this.largura;
        this.iluminacao = this.area * 18;
        
        
        return "O valor da área é: " + this.area +
                "\nA potência necessária é: " + this.iluminacao;
    }
  
}// Fecha chave