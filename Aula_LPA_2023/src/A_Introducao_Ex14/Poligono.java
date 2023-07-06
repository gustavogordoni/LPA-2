package A_Introducao_Ex14;


public class Poligono{
    
    private double lados, diagonais;
    
    public double calcularDiagonais (double lados){   
  
        this.lados = lados;
      
        this.diagonais = this.lados * (this.lados - 3) / 2;
        
        return this.diagonais;
    }
  
}// Fecha chave