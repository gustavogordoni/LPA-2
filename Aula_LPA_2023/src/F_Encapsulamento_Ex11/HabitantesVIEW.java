package F_Encapsulamento_Ex11;

import javax.swing.JOptionPane;
public class HabitantesVIEW {

    public static void main(String args[]) {
        try {
            String mensagem;
            HabitantesCTR habitantesCTR = new HabitantesCTR();
            HabitantesDTO habitantesDTO = new HabitantesDTO();

            habitantesDTO.setEntra_dados(1);
            while (habitantesDTO.getEntra_dados() != 0) {

                habitantesDTO.setSexo(
                    JOptionPane.showInputDialog(
                    "Digite o sexo do habitante"));
                habitantesDTO.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite o salário do habitante")));

                mensagem = habitantesCTR.calcularPessoas(habitantesDTO);
                if (!mensagem.equals("OK")) {
                    JOptionPane.showMessageDialog(null, mensagem);
                } //fecha if

                habitantesDTO.setEntra_dados(Integer.parseInt(JOptionPane.showInputDialog("Entra com os dados de outro habitante? \n 1-Sim | 0-Não")));

            } //fecha while

            JOptionPane.showMessageDialog(null, habitantesCTR.Imprimir(habitantesDTO));
        } //fecha try
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro 003");
        } //fecha catch
    } //fecha main	
} //fecha classe