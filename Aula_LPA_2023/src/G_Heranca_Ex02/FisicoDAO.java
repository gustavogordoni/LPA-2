package G_Heranca_Ex02;

public class FisicoDAO extends ClienteDAO{
    public String mostraDadosFisi(FisicoDTO fisicoDTO){
        return "O CPF do cliente: " + fisicoDTO.getCpf() +
                "\n O RG do cliente: " + fisicoDTO.getRg();
                
    }
}
