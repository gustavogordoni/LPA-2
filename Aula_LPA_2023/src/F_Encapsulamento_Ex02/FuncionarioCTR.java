package F_Encapsulamento_Ex02;

public class FuncionarioCTR {
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    public String imprimir(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.imprimir(funcionarioDTO);

    }
}    
                                                                                                                                                                                                                