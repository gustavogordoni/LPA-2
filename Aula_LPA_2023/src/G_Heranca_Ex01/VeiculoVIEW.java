package G_Heranca_Ex01;
import javax.swing.JOptionPane;

public class VeiculoVIEW {
     public static void main(String args[]) {
        try {    
            JOptionPane.showMessageDialog(null, "Vamos trabalhar com o Objeto Carro");
            CarroCTR carroCTR = new CarroCTR();
            CarroDTO carroDTO = new CarroDTO();
            
            carroDTO.setPlaca(
                JOptionPane.showInputDialog(
                    "Infome a Placa do carro: "));
            
            carroDTO.setCor(
                JOptionPane.showInputDialog(
                    "Infome a Cor do carro: "));
            
            carroDTO.setPotencia(Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Infome a Potência do carro: ")));
            
            carroDTO.setQtd_portas(Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Infome a Quantidade de Portas do carro: ")));

            JOptionPane.showMessageDialog(null, carroCTR.imprimirPlaca(carroDTO));
            JOptionPane.showMessageDialog(null, carroCTR.imprimirCor(carroDTO));
            JOptionPane.showMessageDialog(null, carroCTR.imprimirPotencia(carroDTO));
            JOptionPane.showMessageDialog(null, carroCTR.imprimirQtd_portas(carroDTO));
            
            // ------------------------------------------------------------------------- //
            
            JOptionPane.showMessageDialog(null, "Vamos trabalhar com o Objeto Moto");
            MotoCTR motoCTR = new MotoCTR();
            MotoDTO motoDTO = new MotoDTO();
            
            motoDTO.setPlaca(
                JOptionPane.showInputDialog(
                    "Infome a Placa da moto: "));
            
            motoDTO.setCor(
                JOptionPane.showInputDialog(
                    "Infome a Cor da moto: "));
            
            motoDTO.setCilindrada(Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Infome a Cilindrada da moto: ")));
            
            motoDTO.setTipo_motor(
                JOptionPane.showInputDialog(
                    "Infome o tipo do Motor 2T ou 4T: "));

            JOptionPane.showMessageDialog(null, motoCTR.imprimirPlaca(motoDTO));
            JOptionPane.showMessageDialog(null, motoCTR.imprimirCor(motoDTO));
            JOptionPane.showMessageDialog(null, motoCTR.imprimirCilindrada(motoDTO));
            JOptionPane.showMessageDialog(null, motoCTR.imprimirTipo_motor(motoDTO));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro 002");
        }
    }
    
}
