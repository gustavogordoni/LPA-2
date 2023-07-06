// Faça um programa que receba o número de lados de um polígono convexo,
//calcule e mostre o número de diagonais desse polígono, onde N é o número de
//lados do polígono. Sabe-se que ND= N * (n-3)/2

package A_Introducao_Ex14;

import javax.swing.JOptionPane;

public class PrincipalPoligono{
    
    public static void main (String [] args){
        
        Poligono poligono = new Poligono();
        
        double lados;
       
        lados = Double.parseDouble(
       JOptionPane.showInputDialog(
       "Informe o número de lados: "));
      
       JOptionPane.showMessageDialog(null, "O número de diagonais é: " + 
               poligono.calcularDiagonais(lados));
    
    }//Fecha main

}// Fecha chave
