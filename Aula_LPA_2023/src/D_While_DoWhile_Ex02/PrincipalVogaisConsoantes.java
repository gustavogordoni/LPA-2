package D_While_DoWhile_Ex02;

import javax.swing.JOptionPane;

public class PrincipalVogaisConsoantes {
    
    public static void main (String [] args){
        String letra;  
        letra = "";
        VogaisConsoantes vogaisconsoantes = new VogaisConsoantes();
        
        while(!letra.equalsIgnoreCase("0")){
            letra = JOptionPane.showInputDialog("Informe a letra: ");
            vogaisconsoantes.calcular(letra);
        }
        
        JOptionPane.showMessageDialog(null, vogaisconsoantes.mostra());
    
    }//Fecha main
}// Fecha