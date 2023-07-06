/*
Um funcionario recebe um salário fixo mais 4% de comissão sobre as vendas.
Faça um programa que receba o salário fixo de um funcionário e o valor de suas 
vendas, calcule e mostre a comissão e o salário final do funcionário
*/

package A_Introducao_Ex04;
import javax.swing.JOptionPane;
public class PrincipalSalario {
    
    public static void main(String[] args) {
        Salario salario = new Salario();
        
        double sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário fixo: "));
        double vend = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de vendas: "));
        JOptionPane.showMessageDialog(null,salario.calcularSalario(sal, vend));
        
    
        
    }  
}
    
