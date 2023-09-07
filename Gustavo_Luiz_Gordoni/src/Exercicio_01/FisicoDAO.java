package Exercicio_01;

public class FisicoDAO extends ClienteDAO{    
    public String mostraDadosFisi(FisicoDTO fisicoDTO){
        return mostraDadosCli(fisicoDTO) + 
                "\nO CPF do cliente: " + fisicoDTO.getCpf() +
                "\n O RG do cliente: " + fisicoDTO.getRg();
                
    }
}
