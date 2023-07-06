// Você esrtá fazendo um trabalho de classificação de solo. Após colher uma
//amostra e verificar a quantidade de pontos de água presente nela, classificou
//a amostra em:
// Rochosa: sem ou igual a 10 pontos de água;
// Firme: se mais do 10 e menos ou igual a 40 pontos;
// Pantanosa: se mais de 40 e menos ou igual a 80 pontos;
// Quantidade inválida: se mais do que 80 pontos.

package B_IF_Ex02;

import javax.swing.JOptionPane;

public class PrincipalSolo {
    
    public static void main (String [] args){
        
        Solo solo = new Solo();
        
        JOptionPane.showMessageDialog(null, "A amostra é classificada como: " + 
               solo.calcularSolo(
                    Double.parseDouble
                       (JOptionPane.showInputDialog("Informe a pontuação de solo: "))
                        
               ));
    
    }//Fecha main

}// Fecha chave


