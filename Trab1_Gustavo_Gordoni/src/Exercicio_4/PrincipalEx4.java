package Exercicio_4;

import javax.swing.JOptionPane;

public class PrincipalEx4 {
    
    public static void main (String [] args){
        
        Ex4 ex4 = new Ex4();
        
        JOptionPane.showMessageDialog(null, "O salário a receber é de: R$" +  
               ex4.calcular(
                    Double.parseDouble
                       (JOptionPane.showInputDialog("Informe o n° de horas trabalhadas: ")),
                       
                    Double.parseDouble
                       (JOptionPane.showInputDialog("Informe o valor do salário mínimo: ")),
                    
                    Double.parseDouble
                       (JOptionPane.showInputDialog("Informe o n° de horas extras: "))
                   
               ));
    
    }//Fecha main

}// Fecha chave

