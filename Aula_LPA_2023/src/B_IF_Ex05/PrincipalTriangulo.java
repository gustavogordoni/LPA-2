package B_IF_Ex05;

import javax.swing.JOptionPane;

public class PrincipalTriangulo {
    
    public static void main (String [] args){
        
        Triangulo triangulo = new Triangulo();
        
        JOptionPane.showMessageDialog(null,
            triangulo.calcular(
                Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do lado A: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do lado B: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do lado C: "))
            ));
    
    }//Fecha main
}// Fecha chave         ;)  :|  '-' '.' ._. UwU L8p 