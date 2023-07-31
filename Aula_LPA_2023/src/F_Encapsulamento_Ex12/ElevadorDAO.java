package F_Encapsulamento_Ex12;

public class ElevadorDAO {

    String mensagem = "";

    public String calcularPessoas(ElevadorDTO elevadorDTO) {
        try {
            mensagem = "OK";
            elevadorDTO.setN_pessoas_f(elevadorDTO.getN_pessoas_f() + elevadorDTO.getN_pessoas_e());
            elevadorDTO.setN_pessoas_f(elevadorDTO.getN_pessoas_f() - elevadorDTO.getN_pessoas_s());

            if (elevadorDTO.getN_pessoas_f() > 15) {
                mensagem = "O número de pessoas dentro do elevador é maior do que o permitido. \n";
                mensagem += "Devem sair " + (elevadorDTO.getN_pessoas_f() - 15) + "  Pessoa(s). \n";
                mensagem += "Digite novamente o número de pessoas que entraram e sairam do elevador neste andar. \n";
                elevadorDTO.setN_pessoas_f(elevadorDTO.getN_pessoas_f() - elevadorDTO.getN_pessoas_e());
                elevadorDTO.setN_pessoas_f(elevadorDTO.getN_pessoas_f() + elevadorDTO.getN_pessoas_s());
                elevadorDTO.setContador(elevadorDTO.getContador() - 1);
            }

            if (elevadorDTO.getN_pessoas_f() < 0) {
                mensagem = "O número total de pessoas não pode ser menor que 0 (zero).\n";
                mensagem += "Digite novamente o número de pessoas que entraram e sairam do elevador neste andar. \n";
                elevadorDTO.setN_pessoas_f(elevadorDTO.getN_pessoas_f() - elevadorDTO.getN_pessoas_e());
                elevadorDTO.setN_pessoas_f(elevadorDTO.getN_pessoas_f() + elevadorDTO.getN_pessoas_s());
                elevadorDTO.setContador(elevadorDTO.getContador() - 1);
            }

            return mensagem;
        } catch (Exception e) {
            return mensagem = "Erro 001!";
        }

    }

    public String imprimirNumeroPessoas(ElevadorDTO elevadorDTO) {
        try {
            mensagem = "O Número de pessoas dentro do elevador no ultimo andar é: " + elevadorDTO.getN_pessoas_f();
            return mensagem;
        } catch (Exception e) {
            return mensagem = "Erro 002";
        }

    }

}