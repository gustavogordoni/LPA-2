package F_Encapsulamento_Ex10;
import javax.swing.JOptionPane;
public class CardapioVIEW {
   public static void main (String [] args){
       try{
           CardapioDTO cardapioDTO = new CardapioDTO();
           CardapioCTR cardapioCTR = new CardapioCTR();
            
           do{
                cardapioDTO.setProd(Integer.parseInt(
                        JOptionPane.showInputDialog(
                                  "Código        Produto     Preço(R$)\n"
                                + "  1         Hamburguer     1.50\n"
                                + "  2        Cheesburguer    1.80\n"
                                + "  3        Misto Quente    1.20\n"
                                + "  4          Americano     2.00\n"
                                + "  5        Queijo Prato    1.00\n"
                                + "Informe o código do produto: ")));

               JOptionPane.showMessageDialog(null, cardapioCTR.somarConta(cardapioDTO));
           }while(cardapioDTO.getProd() != 0);
           
           JOptionPane.showMessageDialog(null, cardapioCTR.imprimirConta(cardapioDTO));

       }
       catch(Exception e){
           JOptionPane.showMessageDialog (null, "Erro no sistema: " + e.getMessage());           
       }       
   }        
}