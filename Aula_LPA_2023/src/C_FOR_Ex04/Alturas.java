package C_FOR_Ex04;

public class Alturas{
    
    private double alt, soma, media;
    private int maior20;
    
    
    public void calcular (double alt){   
  
        this.alt = alt;

	if (this.alt > 2 ){
            this.maior20 ++;
            // this.maior20 = this.maior20 + 1;
            // this.maior20 += 1;
	}
	else{
	}
        
        this.soma = this.soma + this.alt;
        this.media = this.soma / 20;
    }
    
    public String media (){   
        return "A média das alturas são: \n" + this.media;
    }
    
    public String maiores (){   
        return "A quantidade de pessoas maiores de 2 metros são: \n" + this.maior20;
    }
  
}// Fecha chave

