package Exercicio_02;

public class FuncionarioCTR {
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    public String mostraDadosFuncionario(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.mostraDadosFuncionario(funcionarioDTO);
    }    
}
