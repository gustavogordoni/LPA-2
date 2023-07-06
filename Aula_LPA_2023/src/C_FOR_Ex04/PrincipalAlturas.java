/*
        Construa um algoritmo que leia a altura de 20 pessoas. O algoritmo deve 
    calcular e imprimir quantas pessoas possuem altura maior que 2 metros e a 
    media de todas as alturas.
*/

package C_FOR_Ex04;

import javax.swing.JOptionPane;

public class PrincipalAlturas {
    
    public static void main (String [] args){
        
        Alturas alturas = new Alturas();
 
        for (int cont=1; cont <= 20; cont++){
            alturas.calcular(
                Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: "))  
            );                 
        }
        
        JOptionPane.showMessageDialog(null, alturas.media());
        
        JOptionPane.showMessageDialog(null, alturas.maiores());
    
    }//Fecha main

}// Fecha chave