package _06herencaPolimorfismo.exercicios.classeMetodosAbstratos.classes;

public abstract class Contribuintes {
    private String nome;
    private double rendaAnua;

    public Contribuintes(){}

    public Contribuintes(String nome, double rendaAnua) {
        this.nome = nome;
        this.rendaAnua = rendaAnua;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaAnua() {
        return rendaAnua;
    }

    public void setRendaAnua(double rendaAnua) {
        this.rendaAnua = rendaAnua;
    }


    public abstract double calcularImposto();

}
