package Exercicio_01;

public class ClienteDAO {
    public String mostraDadosCli(ClienteDTO clienteDTO){
        return "Nome do cliente: " + clienteDTO.getNome() +
                "\n Endereço do cliente: " + clienteDTO.getEndereco() +
                "\n O número da casa do cliente: " + clienteDTO.getNumero() +
                "\n A cidade do cliente é: " + clienteDTO.getCidade() +
                "\n O estado do cliente é: " + clienteDTO.getEstado();
    }
}
