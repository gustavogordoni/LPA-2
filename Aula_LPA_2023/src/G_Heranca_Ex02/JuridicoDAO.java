package G_Heranca_Ex02;

public class JuridicoDAO extends ClienteDAO{
    public String mostraDadosJuri(JuridicoDTO juridicoDTO){
        return "O CNPJ do cliente: " + juridicoDTO.getCnpj() +
                "\n A inscrição estadual do cliente: " + juridicoDTO.getIe();
                
    }
}
