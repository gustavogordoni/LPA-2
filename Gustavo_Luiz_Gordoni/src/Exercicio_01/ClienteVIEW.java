package Exercicio_01;
import javax.swing.JOptionPane;
public class ClienteVIEW {
    public static void main (String[] args){
        try{
            JOptionPane.showMessageDialog(null, "Vamos trabalhar com a Pessoa Fisica");
            FisicoDTO fisicoDTO = new FisicoDTO();
            FisicoCTR fisicoCTR = new FisicoCTR();
            
            fisicoDTO.setNome(
                JOptionPane.showInputDialog
                    ("Informe o nome da pessoa física:"));
                    
            fisicoDTO.setEndereco(
                JOptionPane.showInputDialog
                    ("Informe o endereço da pessoa física:"));
                    
            fisicoDTO.setNumero(
                Integer.parseInt
                    (JOptionPane.showInputDialog("Informe o número da pessoa física:")));
                    
            fisicoDTO.setCidade(
                JOptionPane.showInputDialog
                    ("Informe a cidade da pessoa física:"));
                    
            fisicoDTO.setEstado(
                JOptionPane.showInputDialog
                    ("Informe o estado da pessoa física:"));
                    
            fisicoDTO.setCpf(
                JOptionPane.showInputDialog
                    ("Informe o CPF da pessoa física:"));
                    
            fisicoDTO.setRg(
                JOptionPane.showInputDialog
                    ("Informe o RG da pessoa física:"));
                    
            
            //JOptionPane.showMessageDialog(null, fisicoCTR.mostraDadosCli(fisicoDTO));
            JOptionPane.showMessageDialog(null, fisicoCTR.mostraDadosFisi(fisicoDTO));
            
            //////////////////////
            
            JOptionPane.showMessageDialog(null, "Vamos trabalhar com a Pessoa Jurídica");
            JuridicoDTO juridicoDTO = new JuridicoDTO();
            JuridicoCTR juridicoCTR = new JuridicoCTR();
            
            juridicoDTO.setNome
                (JOptionPane.showInputDialog
                    ("Informe o nome da pessoa jurídica:"));
                    
            juridicoDTO.setEndereco
                (JOptionPane.showInputDialog
                    ("Informe o endereço da pessoa jurídica:"));
                    
            juridicoDTO.setNumero
                (Integer.parseInt(
                        JOptionPane.showInputDialog("Informe o número da pessoa jurídica:")));
                        
            juridicoDTO.setCidade
                (JOptionPane.showInputDialog
                    ("Informe a cidade da pessoa jurídica:"));
                    
            juridicoDTO.setEstado
                (JOptionPane.showInputDialog
                    ("Informe o estado da pessoa jurídica:"));
                    
            juridicoDTO.setCnpj
                (JOptionPane.showInputDialog
                    ("Informe o CNPJ da pessoa jurídica:"));
                    
            juridicoDTO.setIe
                (JOptionPane.showInputDialog
                    ("Informe o Ie da pessoa jurídica:"));
                    
            
            //JOptionPane.showMessageDialog(null, juridicoCTR.mostraDadosCli(juridicoDTO));
            JOptionPane.showMessageDialog(null, juridicoCTR.mostraDadosJuri(juridicoDTO));
            
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, "Erro no sistema");
        }
    }
}
