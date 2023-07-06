package D_While_DoWhile_Ex03;

import javax.swing.JOptionPane;

public class PrincipalAudienciaTV {
    
    public static void main (String [] args){
        int canal;
        canal = 1;

        AudienciaTV audienciatv = new AudienciaTV();
        
        while(canal != 0){
            canal = Integer.parseInt(JOptionPane.showInputDialog("Informe o canal: "));
            audienciatv.calcular(canal);
        }
        
        JOptionPane.showMessageDialog(null, audienciatv.mostra());
    
    }//Fecha main
}// Fecha