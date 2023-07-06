package F_Encapsulamento_Ex03;

public class CNHDAO {
    // private String mensagem;
    public String mostrarResposta(CNHDTO cnhDTO){
             
        if(cnhDTO.getIdade() >= 18){
            return  "O mostorista pode ter CNH";
            // this.mensagem = "";
        }
        else{
            return "O mostorista não pode ter CNH";
            // this.mensagem = "";
        }  
    // return this.mensagem      
    }    
    
}
