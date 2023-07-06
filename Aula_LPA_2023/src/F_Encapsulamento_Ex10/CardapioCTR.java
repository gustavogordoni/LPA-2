package F_Encapsulamento_Ex10;

public class CardapioCTR {
    CardapioDAO cardapioDAO = new CardapioDAO();

    public boolean somarConta(CardapioDTO cardapioDTO){
        return cardapioDAO.somarConta(cardapioDTO);
    }
    
    public String imprimirConta(CardapioDTO cardapioDTO){
        return cardapioDAO.imprimirConta(cardapioDTO);
    }
}