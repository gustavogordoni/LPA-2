package F_Encapsulamento_Ex02;

public class FuncionarioDAO {
    public String imprimir (FuncionarioDTO funcionarioDTO){
        
        return "O código foi: " + funcionarioDTO.getCodigo() 
                + "\n O telefone informado foi: " + funcionarioDTO.getTelefone();
    }    
}
                                                                                                                                                                                