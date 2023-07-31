package F_Encapsulamento_Ex11;

public class HabitantesCTR {

    HabitantesDAO habitantesDAO = new HabitantesDAO();
    public String calcularPessoas(HabitantesDTO habitantesDTO) {
        return habitantesDAO.calcularPessoas(habitantesDTO);

    } //fecha o metodo

    public String Imprimir(HabitantesDTO habitantesDTO) {

        return habitantesDAO.Imprimir(habitantesDTO);

    } //fecha metodo
} //fecha calsse