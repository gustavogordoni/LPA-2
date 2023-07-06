package F_Encapsulamento_Ex07;
import javax.swing.JOptionPane;
public class DecrescenteVIEW {
   public static void main (String [] args){
       try{
           DecrescenteDTO decrescenteDTO = new DecrescenteDTO();
           DecrescenteCTR decrescenteCTR = new DecrescenteCTR();
           
           JOptionPane.showMessageDialog (null, "Informe os três primeiros números em ordem crescente: ");     
           
           decrescenteDTO.setN1(Integer.parseInt(
                   JOptionPane.showInputDialog("Informe o primeiro número: ")));
           
           decrescenteDTO.setN2(Integer.parseInt(
                   JOptionPane.showInputDialog("Informe o segundo número: ")));
           
           decrescenteDTO.setN3(Integer.parseInt(
                   JOptionPane.showInputDialog("Informe o terceiro número: ")));
           
           decrescenteDTO.setN4(Integer.parseInt(
                   JOptionPane.showInputDialog("Informe o quarto número: ")));
           
          JOptionPane.showMessageDialog(null, decrescenteCTR.mostrarResposta(decrescenteDTO));

       }
       catch(Exception e){
           JOptionPane.showMessageDialog (null, "Erro no sistema: " + e.getMessage());           
       }       
   }        
}