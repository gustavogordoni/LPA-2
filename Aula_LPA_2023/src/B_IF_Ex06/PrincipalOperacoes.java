/*
    Faça um algoritmo que solicite dois números inteiros e a operação que deseja
  realizar.
    (A- Adição  S- Subtração    M- Multiplicação    D- Divisão)
*/

package B_IF_Ex06;

import javax.swing.JOptionPane;

public class PrincipalOperacoes{
    
    public static void main (String [] args){
        
        Operacoes operacoes = new Operacoes();
        
        JOptionPane.showMessageDialog(null, "Resultado: " +
            operacoes.calcular(
                Integer.parseInt(JOptionPane.showInputDialog("Informe o n°1: ")),
                Integer.parseInt(JOptionPane.showInputDialog("Informe o n°2: ")),
                (JOptionPane.showInputDialog("Informe a operação:\n "
                                             + "A - Adição \n"
                                             + "S - Subtração \n"
                                             + "M - Multiplicação \n"
                                             + "D - Divisão"))   
            ));
    
    }//Fecha main

}// Fecha chave
