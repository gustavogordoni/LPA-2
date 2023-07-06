/*Pedro comprou um saco de ração com peso em quilos.
Pedro possui dois gatos para os quais fornece a quantidade de ração em granmas
Faça um programa que receba o peso do saco de ração e a quantidade de ração fornecida
para cada gato.
Calcule e mostre quanto restará de reação em quilos no saco após cinco dias.*/

package A_Introducao_Ex09;
import javax.swing.JOptionPane;
public class PrincipalRacao{
    
    public static void main(String[] args) {
        Racao racao = new Racao();
        
        double saco = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do saco de ração (em Kg): "));
        double gato1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de ração para o gato 1: "));
        double gato2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de ração para o gato 2: "));
       
      
        JOptionPane.showMessageDialog(null,"Restará " + racao.calcularRacao(saco, gato1, gato2) + " Kg de ração após 5 dias");
    }  
}