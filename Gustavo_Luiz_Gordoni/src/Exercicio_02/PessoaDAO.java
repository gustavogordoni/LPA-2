package Exercicio_02;

public class PessoaDAO {
    public String mostraDadosPessoa(PessoaDTO pessoaDTO){
        return "Nome: " + pessoaDTO.getNome() +
                "\n Endereço: " + pessoaDTO.getEndereco() +
                "\n Número de telefone: " + pessoaDTO.getTelefone() +
                "\n Idade: " + pessoaDTO.getIdade();
    }
    
}
