package D_While_DoWhile_Ex02;
    
public class VogaisConsoantes {
    private String letra;
    private int a, e, i, o, u, consoantes;
    
    
    public void calcular (String letra){
        this.letra = letra;
        
        
        if(this.letra.equalsIgnoreCase("a")){
            this.a++;
        }
        else{
            if(this.letra.equalsIgnoreCase("e")){
                 this.e++;
            }
            else{
                if(this.letra.equalsIgnoreCase("i")){
                    this.i++;
                }
                else{
                    if(this.letra.equalsIgnoreCase("o")){
                        this.o++;
                    }
                    else{
                        if(this.letra.equalsIgnoreCase("u")){
                            this.u++;
                        }
                        else{
                            if(!this.letra.equalsIgnoreCase("0")){
                                this.consoantes++;
                            }
                        }
                    }
                }
            }
        }    
    }
    
    public String mostra(){
        return "Vogal A: " + this.a +
               "\nVogal E: " + this.e +
               "\nVogal I: " + this.i +
               "\nVogal O: " + this.o +
               "\nVogal U: " + this.u +
               "\nConsoantes: " + this.consoantes;
    }
}
