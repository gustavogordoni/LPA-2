package F_Encapsulamento_Ex04;
import javax.swing.JOptionPane;
public class NotasVIEW {
   public static void main (String [] args){
       try{
           NotasDTO notasDTO = new NotasDTO();
           NotasCTR notasCTR = new NotasCTR();
           
           notasDTO.setN1(Double.parseDouble(
                   JOptionPane.showInputDialog("Informe a nota 1: ")));
           
           notasDTO.setN2(Double.parseDouble(
                   JOptionPane.showInputDialog("Informe a nota 2: ")));
          
          JOptionPane.showMessageDialog(null, notasCTR.mostrarResposta(notasDTO));

       }
       catch(Exception e){
           JOptionPane.showMessageDialog (null, "Erro no sistema: " + e.getMessage());           
       }       
   }        
}
