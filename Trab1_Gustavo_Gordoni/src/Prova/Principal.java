package Prova;
import javax.swing.JOptionPane;
public class Principal {
    public static void main (String [] args){
        Ex01 ex01 = new Ex01();
        JOptionPane.showMessageDialog(null, ex01.calcular(
            Integer.parseInt(
                JOptionPane.showInputDialog("Dia da semana: ")),
            Integer.parseInt (JOptionPane.showInputDialog("Informe a idade: ")),
            Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do ingresso: "))
        ));    
    }
}
   
