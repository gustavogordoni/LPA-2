/*
 Faça um programa que receba o salario base de um funcionário.
Calcule e mostre o salário a receber, sabendo que esse funcionário tem gratifica
ção de R$50 e paga imposto de 10% sobre o salário base
 */
package A_Introducao_Ex05;
import javax.swing.JOptionPane;
public class PrincipalSalario {
    
    public static void main(String[] args) {
        Salario salario = new Salario();
        
        double sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário fixo: "));
        JOptionPane.showMessageDialog(null,
                "O salário final é: " + salario.calcularSalario(sal));
      
    }  
}
  