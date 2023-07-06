package Exercicio_3;

import javax.swing.JOptionPane;

public class PrincipalEx3 {
    
    public static void main (String [] args){
        
        Ex3 ex3 = new Ex3();
        
        JOptionPane.showMessageDialog(null,  
               ex3.calcular(
                    Double.parseDouble
                       (JOptionPane.showInputDialog("Informe o valor do produto: "))
                   
               ));
    
    }//Fecha main

}// Fecha chave

