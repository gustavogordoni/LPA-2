package A_Introducao_Ex06;

public class Conv {
    
    private double pes, polegadas, jardas, milhas;
    
    public String calcularPes(double pes){
        this.pes = pes;
        
        this.polegadas = this.pes * 12;
        this.jardas = this.pes / 3;
        this.milhas = this.jardas / 1760;
        
   
        return "Quantidade de polegadas: " + this.polegadas +
               "\nQuantidade de jardas: " + this.jardas +
               "\nQuanridade de milhas: " + this.milhas;
    }  
}
