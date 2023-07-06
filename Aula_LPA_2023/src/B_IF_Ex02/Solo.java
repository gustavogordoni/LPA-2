package B_IF_Ex02;

public class Solo{
    
    private double amostra;
    private String classificacao;
    
    public String calcularSolo (double amostra){   
 
        this.amostra = amostra;
         
	if (this.amostra <= 10){
		this.classificacao = "Rochosa";
	}
	else{
		if (this.amostra <= 40){
			this.classificacao = "Firme";
		}
		else{
                    if (this.amostra <= 80){
			this.classificacao = "Pantanosa";
                    }
                    else{
                        this.classificacao = "Quantidade inválida";
                    }	
		}
	}
        
        return this.classificacao;
    }
  
}// Fecha chave