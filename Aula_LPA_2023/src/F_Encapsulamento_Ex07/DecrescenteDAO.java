package F_Encapsulamento_Ex07;

public class DecrescenteDAO {
    // private String mensagem;
    public String mostrarResposta(DecrescenteDTO decrescenteDTO){          
 
        
	if (decrescenteDTO.getN1() > decrescenteDTO.getN4()){
            return decrescenteDTO.getN3() +  " - " + decrescenteDTO.getN2() +  " - " + decrescenteDTO.getN1() +  " - " + decrescenteDTO.getN4();
	}
	else{
            if ((decrescenteDTO.getN4() > decrescenteDTO.getN1()) && (decrescenteDTO.getN4() < decrescenteDTO.getN2() )){
		return decrescenteDTO.getN3() +  " - " + decrescenteDTO.getN2() +  " - " + decrescenteDTO.getN4() +  " - " + decrescenteDTO.getN1();
            }
            else{
                if ((decrescenteDTO.getN4() > decrescenteDTO.getN2()) && (decrescenteDTO.getN4() < decrescenteDTO.getN3())){
                    return decrescenteDTO.getN3() +  " - " + decrescenteDTO.getN4() +  " - " + decrescenteDTO.getN2() +  " - " + decrescenteDTO.getN1();
                }
                else{
                    return decrescenteDTO.getN4() +  " - " + decrescenteDTO.getN3() +  " - " + decrescenteDTO.getN2() +  " - " + decrescenteDTO.getN1();
                }
            }
	}
    
        
    } 
}