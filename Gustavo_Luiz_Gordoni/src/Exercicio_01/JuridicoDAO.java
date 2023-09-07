package Exercicio_01;

public class JuridicoDAO extends ClienteDAO{
    public String mostraDadosJuri(JuridicoDTO juridicoDTO){
        return mostraDadosCli(juridicoDTO) + 
                "\n O CNPJ do cliente: " + juridicoDTO.getCnpj() +
                "\n A inscrição estadual do cliente: " + juridicoDTO.getIe();
                
    }
}
