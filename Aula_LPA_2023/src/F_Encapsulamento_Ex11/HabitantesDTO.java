package F_Encapsulamento_Ex11;

public class HabitantesDTO {

    private String sexo;
    private int contador, n_mulheres, n_mulheres_sal, n_homens, entra_dados;
    private float salario, soma_salario, media_salario;

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getContador() {
        return this.contador;
    }

    public void setN_mulheres(int n_mulheres) {
        this.n_mulheres = n_mulheres;
    }

    public int getN_mulheres() {
        return this.n_mulheres;
    }

    public void setN_mulheres_sal(int n_mulheres_sal) {
        this.n_mulheres_sal = n_mulheres_sal;
    }

    public int getN_mulheres_sal() {
        return this.n_mulheres_sal;
    }

    public void setN_homens(int n_homens) {
        this.n_homens = n_homens;
    }

    public int getN_homens() {
        return this.n_homens;
    }

    public void setEntra_dados(int entra_dados) {
        this.entra_dados = entra_dados;
    }

    public int getEntra_dados() {
        return this.entra_dados;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSoma_salario(float soma_salario) {
        this.soma_salario = soma_salario;
    }

    public float getSoma_salario() {
        return this.soma_salario;
    }

    public void setMedia_salario(float media_salario) {
        this.media_salario = media_salario;
    }

    public float getMedia_salario() {
        return this.media_salario;
    }
} //fecha a classe