package D_While_DoWhile_Ex01;
    
public class ExemploWhile1 {
    private String letra;
    private int qtd;
    
    public void verificar (String letra){
        this.letra = letra;
        if(this.letra.equalsIgnoreCase("x")){
            this.qtd++;
        }
    }
    
    public int mostra(){
        return this.qtd;
    }
}
