/*
Faça um programa que receba o salário de um funcionário e a porcentagem de aumento.
Calcule e mostre o salário final

Aula: 13/02/2023.
*/
package A_Introducao_Ex03;
import javax.swing.JOptionPane;
public class PrincipalSalario {
    public static void main(String[] args) {
        Salario salario = new Salario();
        
        double sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário: "));
        double porc = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem de aumento: "));
        JOptionPane.showMessageDialog(null,salario.calcularSalario(sal, porc));
        
    }  
}
