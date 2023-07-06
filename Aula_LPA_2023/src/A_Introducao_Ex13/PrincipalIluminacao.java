// Para iluminar de maneira correta os cômodos de uma casa, para cada metro
//quadrado, deve-se usar 18w de potência. Faça um programa que receba as duas
//dimensões de um cômodo (em metros), calcule e mostre a sua área (em metros qua
//drados) e a potência de iluminação que deverá ser utilizada

package A_Introducao_Ex13;

import javax.swing.JOptionPane;

public class PrincipalIluminacao {
    
    public static void main (String [] args){
        
        Iluminacao iluminacao = new Iluminacao();
        
        double comprimento, largura;
       
        comprimento = Double.parseDouble(
       JOptionPane.showInputDialog(
       "Informe o comprimento do comodo: "));
       
        largura = Double.parseDouble(
       JOptionPane.showInputDialog(
       "Informe a largura do comodo: "));

       
      
       JOptionPane.showMessageDialog(null,
               iluminacao.calcularIlu(comprimento, largura));
    
    }//Fecha main

}// Fecha chave


