package Exercicio_2;

import javax.swing.JOptionPane;

public class PrincipalEx2 {
    
    public static void main (String [] args){
        
        Ex2 ex2 = new Ex2();
        
        JOptionPane.showMessageDialog(null, "A divisão do primeiro número pelo segundo número é: " + 
               ex2.calcular(
                    Double.parseDouble
                       (JOptionPane.showInputDialog("Informe o n°1: ")),
                       
                    Double.parseDouble
                       (JOptionPane.showInputDialog("Informe o n°2 (Diferente de 0): "))
                    
               ));
    
    }//Fecha main

}// Fecha chave

