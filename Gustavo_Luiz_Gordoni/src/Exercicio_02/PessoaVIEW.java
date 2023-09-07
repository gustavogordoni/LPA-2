package Exercicio_02;
import javax.swing.JOptionPane;
public class PessoaVIEW {
    public static void main (String[] args){
        try{
            JOptionPane.showMessageDialog(null, "Vamos trabalhar com o Funcionário");
            FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
            FuncionarioCTR funcionarioCTR = new FuncionarioCTR();
            
            funcionarioDTO.setNome(
                JOptionPane.showInputDialog
                    ("Informe o nome do funcionário:"));
                    
            funcionarioDTO.setEndereco(
                JOptionPane.showInputDialog
                    ("Informe o endereço do funcionário:"));
                    
            funcionarioDTO.setTelefone(
                JOptionPane.showInputDialog
                    ("Informe o número de telefone do funcionário:"));
            
            funcionarioDTO.setIdade(
                Integer.parseInt
                    (JOptionPane.showInputDialog("Informe a idade do funcionário:")));
                    
            funcionarioDTO.setSiape(
                JOptionPane.showInputDialog
                    ("Informe o siape do funcionário:"));
                    
            funcionarioDTO.setFuncao(
                JOptionPane.showInputDialog
                    ("Informe a função do funcionário:"));
            
            //JOptionPane.showMessageDialog(null, funcionarioCTR.mostraDadosCli(funcionarioDTO));
            JOptionPane.showMessageDialog(null, funcionarioCTR.mostraDadosFuncionario(funcionarioDTO));
            
            //////////////////////
            
            JOptionPane.showMessageDialog(null, "Vamos trabalhar com o Aluno");
            AlunoDTO alunoDTO = new AlunoDTO();
            AlunoCTR alunoCTR = new AlunoCTR();
            
            alunoDTO.setNome(
                JOptionPane.showInputDialog
                    ("Informe o nome do aluno:"));
                    
            alunoDTO.setEndereco(
                JOptionPane.showInputDialog
                    ("Informe o endereço do aluno:"));
                    
            alunoDTO.setTelefone(
                JOptionPane.showInputDialog
                    ("Informe o número de telefone do aluno:"));
            
            alunoDTO.setIdade(
                Integer.parseInt
                    (JOptionPane.showInputDialog("Informe a idade do aluno:")));
                    
            alunoDTO.setProntuario(
                JOptionPane.showInputDialog
                    ("Informe o prontuário do aluno:"));
                    
            alunoDTO.setCurso(
                JOptionPane.showInputDialog
                    ("Informe o curso do aluno:"));
                    
            
            //JOptionPane.showMessageDialog(null, alunoCTR.mostraDadosCli(alunoDTO));
            JOptionPane.showMessageDialog(null, alunoCTR.mostraDadosAluno(alunoDTO));
            
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "Erro no sistema");
        }
    }
}
