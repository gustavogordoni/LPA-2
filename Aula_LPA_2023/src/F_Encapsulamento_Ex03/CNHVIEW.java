package F_Encapsulamento_Ex03;
import javax.swing.JOptionPane;
public class CNHVIEW {
   public static void main (String [] args){
       try{
           CNHDTO cnhDTO = new CNHDTO();
           CNHCTR cnhCTR = new CNHCTR();
           
           cnhDTO.setIdade(Integer.parseInt(
                   JOptionPane.showInputDialog("Informe o idade: ")));
          
          JOptionPane.showMessageDialog(null, cnhCTR.mostrarResposta(cnhDTO));

       }
       catch(Exception e){
           JOptionPane.showMessageDialog (null, "Erro no sistema: " + e.getMessage());           
       }       
   }        
}
