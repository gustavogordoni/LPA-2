/*
    Faça um algoritmo que receba a altura e o peso de uma pessoa.
    De acordo com a tabela a seguir verifique e mostre qual a classificação 
  dessa pessoa.

                                    PESO

    ALTURA       |  Até 60 | Entre 60  |  Acima de 90  |
                 |         |   e 90    |               |
-----------------|-------------------------------------|
Menores de 1,20  |    A    |    D      |       G       |
de 1,20 a 1,70   |    B    |    E      |       H       |
Maiores de 1,70  |    C    |    F      |       I       |


*/

package B_IF_Ex04;

import javax.swing.JOptionPane;

public class PrincipalClassificacao {
    
    public static void main (String [] args){
        
        Classificacao classificacao = new Classificacao();
        
        JOptionPane.showMessageDialog(null,
               classificacao.calcular(
                    Double.parseDouble
                       (JOptionPane.showInputDialog("Informe a altura: ")),
                       
                    Double.parseDouble
                       (JOptionPane.showInputDialog("Informe o peso: "))   
               ));
    }//Fecha main
}// Fecha chave

