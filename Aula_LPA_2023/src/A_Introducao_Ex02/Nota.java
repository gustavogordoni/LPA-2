package A_Introducao_Ex02;

public class Nota {
    
    private double n1, n2, n3, p1, p2, p3, media;
    
    public double calcularMedia(double n1, double n2, double n3, double p1,  double p2,  double p3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

        this.media = ((this.n1 * this.p1)+(this.n2 * this.p2)+(this.n3 * this.p3))/(this.p1 + this.p1 + this.p3);
        
        return this.media;
    }
    
}//Fim classe
