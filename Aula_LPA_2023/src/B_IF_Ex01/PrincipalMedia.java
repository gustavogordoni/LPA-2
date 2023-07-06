package B_IF_Ex01;

import javax.swing.JOptionPane;

public class PrincipalMedia {
    
    public static void main (String [] args){
        
        Media media = new Media();
        
        JOptionPane.showMessageDialog(null, "A situação do aluno é: " + 
               media.calcular(
                    Double.parseDouble
                       (JOptionPane.showInputDialog("Informe a Nota 1 : ")),
                       
                    Double.parseDouble
                       (JOptionPane.showInputDialog("Informe a Nota 2 : "))   
               ));
   
    }//Fecha main

}// Fecha chave
