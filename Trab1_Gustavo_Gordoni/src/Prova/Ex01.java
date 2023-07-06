package Prova;
public class Ex01 {
    private double preco, resf;
    private int idade, ds;
    public String calcular (int ds, int idade, double preco){
        this.ds = ds;
        this.idade = idade;
        this.preco = preco;
        
        if ((this.idade < 18) || (this.ds = 3)) {
            this.resf = this.preco / 2;
        }
        else{
            if((this.idade < 18) && (this.ds = 3)){
                this.resf = this.preco /4;
            }
            else{
                this.resf = this.preco;
            }
        }
        
        return "Resposta: "+ this.resf;
    }
}
