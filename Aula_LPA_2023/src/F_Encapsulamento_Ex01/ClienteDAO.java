package F_Encapsulamento_Ex01;

public class ClienteDAO {
    public String mostrarNomeRg(ClienteDTO clienteDTO){
        return "O nome informado foi: " + clienteDTO.getNome() 
                + "\n O Rg informado foi: " + clienteDTO.getRg();
    }
    
    public String mostrarNomeIdade(ClienteDTO clienteDTO){
        return "O nome informado foi: " + clienteDTO.getNome() 
                + "\n A idade informada foi: " + clienteDTO.getIdade();
    }
    
    
}
