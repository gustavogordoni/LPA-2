package F_Encapsulamento_Ex05;

public class SoloDAO {
    private String classificacao;
    
    public String mostrarResposta(SoloDTO soloDTO){
        
       if (soloDTO.getAmostra() <= 10){
		this.classificacao = "Rochosa";
	}
	else{
		if (soloDTO.getAmostra() <= 40){
			this.classificacao = "Firme";
		}
		else{
                    if (soloDTO.getAmostra() <= 80){
			this.classificacao = "Pantanosa";
                    }
                    else{
                        this.classificacao = "Quantidade de água inválida";
                    }	
		}
	}
       
       return "A amostra é classificada como: " + this.classificacao;
    }
      
    
}