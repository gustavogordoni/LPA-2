// Faça um programa que receba o custo do espetáculo teatral e o preço do convi
//te desse espetáculo. Esse programa deve calcular e mostrar a quantidade de
//convites que devem ser vendidos para que pelo menos o custo do espetáculo seja
//alcançado

package A_Introducao_Ex11;

import javax.swing.JOptionPane;

public class PrincipalConvite {
    
    public static void main (String [] args){
        
        Convite convite = new Convite();
        
        double custo, preco;
       
        custo = Double.parseDouble(
       JOptionPane.showInputDialog(
       "Informe o custo do espetáculo teatral: "));
       
        preco = Double.parseDouble(
       JOptionPane.showInputDialog(
       "Informe o preço do convite: "));

       JOptionPane.showMessageDialog(null, 
               
               convite.calcular(custo, preco));
    
    }//Fecha main

}// Fecha chave