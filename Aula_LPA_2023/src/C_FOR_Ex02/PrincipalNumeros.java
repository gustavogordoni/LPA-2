package C_FOR_Ex02;

import javax.swing.JOptionPane;

public class PrincipalNumeros{
    
    public static void main (String [] args){
        
        Numeros numeros= new Numeros();
        
        JOptionPane.showMessageDialog(null,
            numeros.calcular(
                Integer.parseInt(JOptionPane.showInputDialog ("Informe o n°1: ")),
                Integer.parseInt(JOptionPane.showInputDialog ("Informe o n°2: ")) 
            ));
    
    }//Fecha main

}// Fecha chave