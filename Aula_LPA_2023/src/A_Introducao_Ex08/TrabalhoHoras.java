/* Faça um programa que receba o número de horas trabalhadas e o valor do salário mínimo.
e o valor do salário mínimo.
Calcule e mostre o salário a receber seguindo as regras abaixo:
a) a hora trabalhada vale a metade do salário mínimo;
b) o salário bruto equivale ao número de horas trabalhadas multiplicando pelo valor da hora trabalhada;
c) o imposto equivalente a 3% do salário bruto;
d) o salário a receber equivale ao salário bruto menos o imposto.
*/

package A_Introducao_Ex08;
import javax.swing.JOptionPane;
public class TrabalhoHoras {
    
    public static void main(String[] args) {
        Salario salario = new Salario();
        
        double hrs = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de horas trabalhadas: "));
        double min = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salário mínimo: "));
       
      
        JOptionPane.showMessageDialog(null,"O salário a receber é de: " + salario.calcularSalario(hrs, min) + " R$");
    }  
}