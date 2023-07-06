/*
    Um funcionário de uma empresa arecebe aumento salarial anualmente. Sabe-se 
que: 
    a - esse funcionário foi contratado em 1995, com salário inicial de R$1.000;
    b - em 1996 recebeu o aumento de 1,5% sobre seu salário incial;
    c - a partir de 1997 (inclusive), os aumentos salariais sempre correspondem
    ao dobro do percentual do ano anterior.

    Faça um programa que solicite o ano atual e determine o salário atual desse
funcionário

*/

package C_FOR_Ex05;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class PrincipalSalario {
    
    public static void main (String [] args){
       DecimalFormat formatando = new DecimalFormat("##,###.00");
        
        Salario salario = new Salario();
        
        JOptionPane.showMessageDialog(null, "O salário atual é: R$" + 
            formatando.format(
            salario.calcular(
                Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: "))
            )        
            ));
    
    }//Fecha main

}// Fecha chave

