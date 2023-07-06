package B_IF_Ex05;

public class Triangulo{
    
    private double l1,l2,l3;
    private String res;
    
    public String calcular (double l1, double l2, double l3){   
  
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        
	if ((this.l1 + this.l2 > this.l3 ) &&
            (this.l2 + this.l3 > this.l1 ) &&
            (this.l1 + this.l3 > this.l2 )){
            
            if ((this.l1 == this.l2) && (this.l2 == this.l3)){
                this.res = "O triângulo é equilátero";
            }
            else{
                if ((this.l1 == this.l2) || (this.l2 == this.l3) || (this.l1 == this.l3)){
                this.res = "O triângulo é isósceles";
                }
                else{
                    this.res = "O triângulo é escaleno";
                }
            }    
	}
	else{
            this.res =  "Isso não é um triângulo";
        }
        
        return this.res;
    }
}// Fecha chave