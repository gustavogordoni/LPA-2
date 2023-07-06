package F_Encapsulamento_Ex01;

public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();

    public String mostrarNomeRg(ClienteDTO clienteDTO){
        return clienteDAO.mostrarNomeRg(clienteDTO);
    }
    
    public String mostrarNomeIdade(ClienteDTO clienteDTO){
        return clienteDAO.mostrarNomeIdade(clienteDTO);
    }
}
