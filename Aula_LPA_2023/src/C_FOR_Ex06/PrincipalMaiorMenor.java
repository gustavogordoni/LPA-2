/*
    Faça um algoritmo que solicite 10 números inteiros
    Ao final o algoritmo deve informar o maior e o menro número digitado.
OBS: Deve ser criado um método para verificar os números e o outro somentepara mostrar o resultado.

*/

package C_FOR_Ex06;

import javax.swing.JOptionPane;

public class PrincipalMaiorMenor {
    
    public static void main (String [] args){
        
        MaiorMenor maiormenor= new MaiorMenor();
        
        for (int cont=1; cont <= 10; cont++){
            maiormenor.calcular((int)
                Integer.parseInt(JOptionPane.showInputDialog("Informe o número " + cont + ": "))  
            );                 
        }
        
        JOptionPane.showMessageDialog(null, maiormenor.resposta());
    }//Fecha main

}// Fecha chave