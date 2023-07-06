package F_Encapsulamento_Ex08;
import javax.swing.JOptionPane;
public class CrescenteVIEW {
   public static void main (String [] args){
       try{
           CrescenteDTO crescenteDTO = new CrescenteDTO();
           CrescenteCTR crescenteCTR = new CrescenteCTR();
           
           JOptionPane.showMessageDialog (null, "Informe três números inteiros: ");     
           
           crescenteDTO.setN1(Integer.parseInt(
                   JOptionPane.showInputDialog("Informe o primeiro número: ")));
           
           crescenteDTO.setN2(Integer.parseInt(
                   JOptionPane.showInputDialog("Informe o segundo número: ")));
           
           crescenteDTO.setN3(Integer.parseInt(
                   JOptionPane.showInputDialog("Informe o terceiro número: ")));
           
          JOptionPane.showMessageDialog(null, crescenteCTR.mostrarResposta(crescenteDTO));

       }
       catch(Exception e){
           JOptionPane.showMessageDialog (null, "Erro no sistema: " + e.getMessage());           
       }       
   }        
}