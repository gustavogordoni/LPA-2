package A_Introducao_Ex12;

public class Combustivel {
    
    private double tempo, kml, velmedia, distancia, litros;
    
    public String calcularCombustivel (double tempo, double kml, double velmedia) {  
  
        this.tempo = tempo;
        this.kml = kml;
        this.velmedia = velmedia;
        
            this.distancia = this.velmedia * this.tempo;
            this.litros = this.distancia / this.kml;
        
        return "A velocidade média é de: " + this.velmedia + 
                "\nO tempo gasto na viagem é: " + this.tempo + 
                "\n A distância percorrida é: " + this.distancia + 
                "\nA quantidade de litros utilizados é: " + this.litros;
    }
  
}// Fecha chave