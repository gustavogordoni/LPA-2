/*
Faça um programa  que receba uma medida em pés.
Faça as conversões a seguir e mostre os resultados
a) polegadas
b) Jardas
c) milhas
Sabe-se que: 
1 pé = 12 polegadas
1 jarda = 3 pés
1 milha = 1760 jardas
 */

package A_Introducao_Ex06;
import javax.swing.JOptionPane;
public class Conversao_Pes {
    
    public static void main(String[] args) {
        Conv conv = new Conv();
        
        double pes = Double.parseDouble(JOptionPane.showInputDialog("Informe uma média de pés: "));
        
        JOptionPane.showMessageDialog(null,conv.calcularPes(pes));
      
    }  
}
