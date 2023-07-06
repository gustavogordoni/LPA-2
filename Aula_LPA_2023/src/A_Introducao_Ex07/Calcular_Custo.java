/* O custo ao consumidor de um carro novo é a soma do preço de fábrica com o percentual
de lucro do distribuidor e dos impostos ao preço de fábrica. Faça um programa que
receba o preço de fábrica de um veículo, o percentual de lucro do distribuidor e
o percentual de impostos. Calcule e mostre:
a) o valor correspondente ao lucro do distribuidor;
b) o valor correspondente ao imposto;
c) o preço final do veículo*/

package A_Introducao_Ex07;
import javax.swing.JOptionPane;
public class Calcular_Custo {
    
    public static void main(String[] args) {
        Custo custo = new Custo();
        
        double fabrica = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço de fábrica: "));
        double lucro = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de lucro do distribuidor: "));
        double imposto = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de impostos: "));
      
        JOptionPane.showMessageDialog(null,custo.calcularValores(fabrica, lucro, imposto));
    }  
}
