package B_IF_Ex03;

public class Quatron{
    
    private int n1, n2 ,n3 ,n4;
    private String order;
    
    public String calcular (double n1, double n2, double n3, double n4){   
  
        this.n1 = (int) n1;
        this.n2 = (int) n2;
        this.n3 = (int) n3;
        this.n4 = (int) n4;
        
        
	if (this.n1 > this.n4){
            this.order = this.n3 +  " - " + this.n2 +  " - " + this.n1 +  " - " + this.n4;
	}
	else{
            if ((this.n4 > this.n1) && (this.n4 < this.n2)){
		this.order =  this.n3 +  " - " + this.n2 +  " - " + this.n4 +  " - " + this.n1;
            }
            else{
                if ((this.n4 > this.n2) && (this.n4 < this.n3)){
                    this.order =  this.n3 +  " - " + this.n4 +  " - " + this.n2 +  " - " + this.n1;
                }
                else{
                    this.order =  this.n4 +  " - " + this.n3 +  " - " + this.n2 +  " - " + this.n1;
                }
            }
	}
         
        return this.order;
    }
  
}// Fecha chave