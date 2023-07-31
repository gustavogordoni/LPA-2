package F_Encapsulamento_Ex12;

import javax.swing.JOptionPane;
public class ElevadorVIEW {

    public static void main(String args[]) {
        try {
            String mensagem;
            ElevadorCTR elevadorCTR = new ElevadorCTR();
            ElevadorDTO elevadorDTO = new ElevadorDTO();

            elevadorDTO.setN_andares(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de andares do prédio.")));

            for (elevadorDTO.setContador(1); elevadorDTO.getContador() <= elevadorDTO.getN_andares(); elevadorDTO.setContador(elevadorDTO.getContador() + 1)) {

                elevadorDTO.setN_pessoas_e(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas que entram no elevador no "
                        + elevadorDTO.getContador() + "º andar :")));
                elevadorDTO.setN_pessoas_s(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas que sairam do elevador no "
                        + elevadorDTO.getContador() + "º andar :")));

                mensagem = elevadorCTR.calcularPessoas(elevadorDTO);
                if (!mensagem.equals("OK")) {
                    JOptionPane.showMessageDialog(null, mensagem);
                }

            }

            JOptionPane.showMessageDialog(null, elevadorCTR.imprimirNumeroPessoas(elevadorDTO));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro 003");
        }
    }
}