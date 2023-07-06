package F_Encapsulamento_Ex09;
import javax.swing.JOptionPane;
public class AlturaVIEW {
   public static void main (String [] args){
       try{
           AlturaDTO alturaDTO = new AlturaDTO();
           AlturaCTR alturaCTR = new AlturaCTR();
            
           alturaDTO.setAltura(Double.parseDouble(
                   JOptionPane.showInputDialog("Informe a altura ")));
           
           alturaDTO.setPeso(Double.parseDouble(
                   JOptionPane.showInputDialog("Informe o peso: ")));
           
          JOptionPane.showMessageDialog(null, alturaCTR.mostrarResposta(alturaDTO));

       }
       catch(Exception e){
           JOptionPane.showMessageDialog (null, "Erro no sistema: " + e.getMessage());           
       }       
   }        
}