/*
Faça um algoritmo que receba três números obrigatoriamente em ordem crescente
e um quarto número (qualquer) que não siga a regra dos três primeiros. Ao final
o algoritmo deve imprimir os quatro números em ordem decrescente (do maior para
o menor).
Os números devem ser do tipo inteiro.

*/
package B_IF_Ex03;

import javax.swing.JOptionPane;

public class PrincipalQuatroNumeros {
    
    public static void main (String [] args){
        
        Quatron quatron = new Quatron();
        
        JOptionPane.showMessageDialog(null, "Order decrescente: " + 
               quatron.calcular(
                    Integer.parseInt
                       (JOptionPane.showInputDialog("Informe o primeiro número: ")),
                       
                    Integer.parseInt
                       (JOptionPane.showInputDialog("Informe o segundo número: ")),
                    
                    Integer.parseInt
                       (JOptionPane.showInputDialog("Informe o terceiro número: ")),
                    
                    Integer.parseInt
                       (JOptionPane.showInputDialog("Informe o quatro número: "))
               ));
        
    }//Fecha main

}// Fecha chave

