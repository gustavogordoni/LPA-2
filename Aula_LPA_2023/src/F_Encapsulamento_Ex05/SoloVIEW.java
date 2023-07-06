package F_Encapsulamento_Ex05;
import javax.swing.JOptionPane;
public class SoloVIEW {
   public static void main (String [] args){
       try{
           SoloDTO soloDTO = new SoloDTO();
           SoloCTR soloCTR = new SoloCTR();
           
           soloDTO.setAmostra(Double.parseDouble(
                   JOptionPane.showInputDialog("Informe a pontuação de solo: ")));
           
          JOptionPane.showMessageDialog(null, soloCTR.mostrarResposta(soloDTO));

       }
       catch(Exception e){
           JOptionPane.showMessageDialog (null, "Erro no sistema: " + e.getMessage());           
       }       
   }        
}