package Exercicio_02;

public class FuncionarioDAO extends PessoaDAO{
    private int idade;
    
    private String calculoAposentadoria(PessoaDTO pessoaDTO){
        if(pessoaDTO.getIdade() < 60){
            this.idade = 60 - pessoaDTO.getIdade();
            return "\n Faltam " + this.idade + " anos para se aposentar";  
        }else{
            return "\n Já pode se aposentar";
        }               
    }
    
    public String mostraDadosFuncionario(FuncionarioDTO funcionarioDTO){
        return mostraDadosPessoa(funcionarioDTO) + 
            "\n Siape: " + funcionarioDTO.getSiape() +
            "\n Função: " + funcionarioDTO.getFuncao() + 
            calculoAposentadoria(funcionarioDTO);                
    } 
}
