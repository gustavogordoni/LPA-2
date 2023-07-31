package F_Encapsulamento_Ex11;

public class HabitantesDAO {

    String mensagem = "";

    public String calcularPessoas(HabitantesDTO habitantesDTO) {
        mensagem = "OK";

        if (habitantesDTO.getSexo().equalsIgnoreCase("Masculino")) {
            habitantesDTO.setN_homens(habitantesDTO.getN_homens() + 1);
            habitantesDTO.setContador(habitantesDTO.getContador() + 1);
            habitantesDTO.setSoma_salario(habitantesDTO.getSoma_salario() + habitantesDTO.getSalario());
        }//fecha if
        else {
            if (habitantesDTO.getSexo().equalsIgnoreCase("Feminino")) {
                habitantesDTO.setN_mulheres(habitantesDTO.getN_mulheres() + 1);
                if (habitantesDTO.getSalario() <= 1000.00) {
                    habitantesDTO.setN_mulheres_sal(habitantesDTO.getN_mulheres_sal() + 1);
                } //fecha if
                habitantesDTO.setContador(habitantesDTO.getContador() + 1);
                habitantesDTO.setSoma_salario(habitantesDTO.getSoma_salario() + habitantesDTO.getSalario());
            } //fecha if
            else {
                mensagem = "Sexo Inválido";
            } //fecha else
        }//fecha else
        return mensagem;

    } //fecha o metodo

    public String Imprimir(HabitantesDTO habitantesDTO) {

        mensagem = "A média salarial do Habitantes é: R$" + (habitantesDTO.getSoma_salario() / habitantesDTO.getContador()) + "\n";
        mensagem = mensagem + "O Percentual de Mulheres é: " + (habitantesDTO.getN_mulheres() * 100) / habitantesDTO.getContador() + "%\n";
        mensagem = mensagem + "O Percentual de mulheres que ganham Salário igual ou inferiror a R$1000.00 é: " + (habitantesDTO.getN_mulheres_sal() * 100) / habitantesDTO.getN_mulheres() + "%\n";
        mensagem = mensagem + "O Percentual de Homens é: " + (habitantesDTO.getN_homens() * 100) / habitantesDTO.getContador() + "%\n";
        return mensagem;

    } //fecha metodo
} //fecha calsse