package Exercicio_1;

import javax.swing.JOptionPane;

public class PrincipalEx1 {
    
    public static void main (String [] args){
        
        Ex1 ex1 = new Ex1();
        
        JOptionPane.showMessageDialog(null, "A resposta dessa multiplicação é: " + 
               ex1.calcular(
                    Double.parseDouble
                       (JOptionPane.showInputDialog("Informe o n°1: ")),
                       
                    Double.parseDouble
                       (JOptionPane.showInputDialog("Informe o n°2: ")),
                    
                    Double.parseDouble
                       (JOptionPane.showInputDialog("Informe o n°3: "))
               ));
    
    }//Fecha main

}// Fecha chave

