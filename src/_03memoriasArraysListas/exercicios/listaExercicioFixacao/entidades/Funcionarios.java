package listaExercicioFixacao.entidades;

public class Funcionarios {
    private Integer id;
    private String nome;
    private double salario;

    public Funcionarios(Integer id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }

    public void aumentarSalario(double porcentagem) {
        this.salario += salario * porcentagem / 100;
    }

}
