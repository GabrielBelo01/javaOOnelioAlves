package _08trabalhandoComArquivos.exercicios._04Funcionarios.mode.entities;

public abstract class Funcionarios {
    private Integer id;
    private String nome;
    private Integer diasTrabalhados;
    private Double valorDia;

    public Funcionarios() {}

    public Funcionarios(Integer id, String nome, Integer diasTrabalhados, Double valorDia) {
        this.id = id;
        this.nome = nome;
        this.diasTrabalhados = diasTrabalhados;
        this.valorDia = valorDia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(Integer diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public Double getValorDia() {
        return valorDia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public abstract Double calcularSalario();

    public  String toString(){
        return getNome() + "," + String.format("%.2f", calcularSalario());
    }

}
