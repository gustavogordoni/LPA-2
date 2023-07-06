package F_Encapsulamento_Ex08;

public class CrescenteDAO {
    // private String mensagem;
    
    public String mostrarResposta(CrescenteDTO crescenteDTO){          
        
        if((crescenteDTO.getN1() < crescenteDTO.getN2()) && (crescenteDTO.getN2() < crescenteDTO.getN3())){
            return crescenteDTO.getN1() + " - " + crescenteDTO.getN2() + " - " + crescenteDTO.getN3();
        }
        else{
            if((crescenteDTO.getN1() < crescenteDTO.getN3()) && (crescenteDTO.getN3() < crescenteDTO.getN2())){
                return crescenteDTO.getN1() + " - " + crescenteDTO.getN3() + " - " + crescenteDTO.getN2();
            } 
            else{
               if((crescenteDTO.getN2() < crescenteDTO.getN1()) && (crescenteDTO.getN1() < crescenteDTO.getN3())){
                   return crescenteDTO.getN2() + " - " + crescenteDTO.getN1() + " - " + crescenteDTO.getN3();
               }
               else{
                   if((crescenteDTO.getN2() < crescenteDTO.getN3()) && (crescenteDTO.getN3() < crescenteDTO.getN1())){
                       return crescenteDTO.getN2() + " - " + crescenteDTO.getN3() + " - " + crescenteDTO.getN1();
                   }
                   else{
                        if((crescenteDTO.getN3() < crescenteDTO.getN1()) && (crescenteDTO.getN1() < crescenteDTO.getN2())){
                            return crescenteDTO.getN3() + " - " + crescenteDTO.getN1() + " - " + crescenteDTO.getN2();
                        } 
                        else{
                            if((crescenteDTO.getN3() < crescenteDTO.getN2()) && (crescenteDTO.getN2() < crescenteDTO.getN1())){
                                return crescenteDTO.getN3() + " - " + crescenteDTO.getN2() + " - " + crescenteDTO.getN1();
                            }
                            else{
                                if((crescenteDTO.getN1() == crescenteDTO.getN2()) && (crescenteDTO.getN1() < crescenteDTO.getN3())){
                                    return crescenteDTO.getN1() + " - " + crescenteDTO.getN2() + " - " + crescenteDTO.getN3();
                                }
                                else{
                                    if((crescenteDTO.getN1() == crescenteDTO.getN2()) && (crescenteDTO.getN1() > crescenteDTO.getN3())){
                                        return crescenteDTO.getN3() + " - " + crescenteDTO.getN1() + " - " + crescenteDTO.getN2();
                                    }
                                    else{
                                        if((crescenteDTO.getN2() == crescenteDTO.getN3()) && (crescenteDTO.getN2() < crescenteDTO.getN1())){
                                            return crescenteDTO.getN2() + " - " + crescenteDTO.getN3() + " - " + crescenteDTO.getN1();
                                        }
                                        else{
                                            if((crescenteDTO.getN2() == crescenteDTO.getN3()) && (crescenteDTO.getN2() > crescenteDTO.getN1())){
                                                return crescenteDTO.getN1() + " - " + crescenteDTO.getN3() + " - " + crescenteDTO.getN2();
                                            }
                                            else{
                                                if((crescenteDTO.getN1() == crescenteDTO.getN3()) && (crescenteDTO.getN1() < crescenteDTO.getN2())){
                                                    return crescenteDTO.getN1() + " - " + crescenteDTO.getN3() + " - " + crescenteDTO.getN2();
                                                }
                                                else{
                                                    if((crescenteDTO.getN1() == crescenteDTO.getN3()) && (crescenteDTO.getN1() > crescenteDTO.getN2())){
                                                        return crescenteDTO.getN2() + " - " + crescenteDTO.getN3() + " - " + crescenteDTO.getN1();
                                                    }
                                                    else{
                                                        return crescenteDTO.getN1() + " - " + crescenteDTO.getN2() + " - " + crescenteDTO.getN3();
                                                    }
                                                    
                                                }
                                            }
                                        }
                                    }
                                }
                                
                            }
                        }
                   }
               }
            }             
        }
        
        
    } 
}