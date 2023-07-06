package A_Introducao_Ex01;
import javax.swing.JOptionPane;
public class Cliente {
    
    private String nome, rg;
    
    public void mostrar(String nome, String rg){
        this.nome = nome;
        this.rg = rg;
        
        JOptionPane.showMessageDialog(null, "O nome informado foi: " + this.nome +
                                            "n0 rg informado foi: " + this.rg);
        
        System.out.println("O nome informado foi: " + this.nome + 
                            " O rg informado foi: " + this.rg);
    }//Fecha o método mostrar
    
    public void mostrarNome(String nome) {
        this.nome = nome;
        
        JOptionPane.showMessageDialog(null, "O nome informado foi: " + this.nome);
        
        System.out.println("O nome inforado foi: " + this.nome);
    }//Fecha o método mostrarNome
    
}//Fechar classe
