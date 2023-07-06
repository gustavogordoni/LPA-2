package Exercicio_5;

import javax.swing.JOptionPane;

public class PrincipalEx5 {
    
    public static void main (String [] args){
        
        Ex5 ex5 = new Ex5();
        
        JOptionPane.showMessageDialog(null,  
               ex5.calcular(
                    Double.parseDouble
                       (JOptionPane.showInputDialog("Informe a quantidade de dinheiro (R$): "))
                   
               ));
    
    }//Fecha main

}// Fecha chave

