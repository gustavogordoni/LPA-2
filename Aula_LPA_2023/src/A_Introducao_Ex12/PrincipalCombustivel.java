// Calcular a quantidade de litros de combustível gastos em uma viagem. Para
//obter o cálculo, o usuário deverá fornecer o tempo gasto, quantos km/l o carro
//faz e a velocidade média durante a viagem. O programa deverá apresentar os
//valores da velocidade média, tempo gasto na viagem, a distância percorrida e a
//quantidade de litros utilizados na viagem

package A_Introducao_Ex12;

import javax.swing.JOptionPane;

public class PrincipalCombustivel {
    
    public static void main (String [] args){
        
        Combustivel combustivel = new Combustivel();
        
        double tempo, kml, velmedia;
       
        tempo = Double.parseDouble(
       JOptionPane.showInputDialog(
       "Informe o tempo gasto na viagem: "));
       
        kml = Double.parseDouble(
       JOptionPane.showInputDialog(
       "Informe quantos km/l o carro faz: "));

        velmedia = Double.parseDouble(
       JOptionPane.showInputDialog(
       "Informe a velocidade média durante a viagem: "));
      
       JOptionPane.showMessageDialog(null, 
               combustivel.calcularCombustivel(tempo, kml, velmedia));
    
    }//Fecha main

}// Fecha chave