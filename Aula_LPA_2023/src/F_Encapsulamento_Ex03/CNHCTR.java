package F_Encapsulamento_Ex03;

public class CNHCTR {
    CNHDAO cnheDAO = new CNHDAO();

    public String mostrarResposta(CNHDTO cnhDTO){
        return cnheDAO.mostrarResposta(cnhDTO);
    }
    }
