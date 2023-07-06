/*
Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. Faça um 
programa que receba o valor do salário mínimo e a quantidade de quilowatts por
uma residência. Calcule e mostre:
    a) o valor, em reais, de caa quilowatt;
    b) o valor, em reais, a ser pago por essa residência;
    c) o valor, em reais, a ser pago com desconto de 15%;

*/

package A_Introducao_Ex10;

import javax.swing.JOptionPane;

public class PrincipalQuilowatt {
    
    public static void main (String [] args){
        
         Quilowatt quilowatt = new Quilowatt();
        
        double salmin,watts;
       
        salmin = Double.parseDouble(
       JOptionPane.showInputDialog(
       "Informe o slário mínimo: "));
       
        watts = Double.parseDouble(
       JOptionPane.showInputDialog(
       "Informe a quantidade de quilowatts consumida: "));
   
       JOptionPane.showMessageDialog(null,
               quilowatt.calcularEnergia(salmin, watts));
    
    }//Fecha main

}// Fecha chave

