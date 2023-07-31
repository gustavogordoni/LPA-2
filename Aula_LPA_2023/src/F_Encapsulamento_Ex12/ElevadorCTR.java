package F_Encapsulamento_Ex12;

public class ElevadorCTR {
        ElevadorDAO elevadorDAO = new ElevadorDAO();

    public String calcularPessoas(ElevadorDTO elevadorDTO){
        return elevadorDAO.calcularPessoas(elevadorDTO);
    }

    public String imprimirNumeroPessoas(ElevadorDTO elevadorDTO) {
        return elevadorDAO.imprimirNumeroPessoas(elevadorDTO);

    } //fecha metodo

}

