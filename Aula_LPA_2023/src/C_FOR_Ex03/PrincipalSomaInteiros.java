package C_FOR_Ex03;
import javax.swing.JOptionPane;

public class PrincipalSomaInteiros {
    
    public static void main (String [] args){
               
       SomaInteiros soma = new SomaInteiros();
       
        for (int cont=1; cont <= 10; cont++){
            soma.calcular(
            Integer.parseInt(JOptionPane.showInputDialog ("Informe o número: "))
            );                 
        }
        
        JOptionPane.showMessageDialog(null, soma.resposta());

    }//Fecha main1

}// Fecha chave
