package F_Encapsulamento_Ex06;

public class TrianguloDAO {
    // private String mensagem;
    private String res;
    public String mostrarResposta(TrianguloDTO trianguloDTO){             
        
        if ((trianguloDTO.getLadoA() + trianguloDTO.getLadoB() > trianguloDTO.getLadoC()) &&
            (trianguloDTO.getLadoB() + trianguloDTO.getLadoC() > trianguloDTO.getLadoA() ) &&
            (trianguloDTO.getLadoA() + trianguloDTO.getLadoC() > trianguloDTO.getLadoB())){
            
        return classifica(trianguloDTO);           
        }    
	else{
            return "Isso não é um triângulo";
        }
    } 
    
    public String classifica (TrianguloDTO trianguloDTO){
        
        if (( trianguloDTO.getLadoA() == trianguloDTO.getLadoB() ) && ( trianguloDTO.getLadoB() == trianguloDTO.getLadoC() )){
            return "O triângulo é equilátero";
            }
        else{
            if ((trianguloDTO.getLadoA() == trianguloDTO.getLadoB() ) || trianguloDTO.getLadoB() == trianguloDTO.getLadoC() || (trianguloDTO.getLadoA() == trianguloDTO.getLadoC())){
            return "O triângulo é isósceles";
            }
            else{
                return "O triângulo é escaleno";
            }
	}
    }
}
    