package D_While_DoWhile_Ex01;

import javax.swing.JOptionPane;

public class Principal_ExemploWhile2 {
    
    public static void main (String [] args){
        int contador = 1;
        int numero = 0;
        
        Exemplowhile2 exemplowhile2 = new Exemplowhile2();
        
        while(contador <= 10){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
            exemplowhile2.somar(numero);
            contador++;
        }
        
        JOptionPane.showMessageDialog(null, exemplowhile2.mostra());
    
    }//Fecha main
}// Fecha chave