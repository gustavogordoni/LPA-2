package A_Introducao_Ex07;

public class Custo {
    
    private double fabrica, lucro, imposto, distribuidor, val_imposto, preco_f;
   
    public String calcularValores(double fabrica,double lucro,double imposto){
        this.fabrica = fabrica;
        this.lucro = lucro;
        this.imposto= imposto;
        
        this.distribuidor = this.fabrica * (this.lucro / 100);
        this.val_imposto = this.fabrica * (this.imposto/100);
        this.preco_f = this.fabrica + this.distribuidor + this.val_imposto;
        
   
        return "Lucro do distribuidor: " + this.distribuidor + " R$" +
               "\nValores de impostos: " + this.val_imposto + " R$" + 
               "\nPreço final do veículo: " + this.preco_f +  " R$";
    }  
}