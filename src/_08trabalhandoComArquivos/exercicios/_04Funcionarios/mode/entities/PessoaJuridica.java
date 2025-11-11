package _08trabalhandoComArquivos.exercicios._04Funcionarios.mode.entities;

public class PessoaJuridica extends Funcionarios {
    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(Integer id, String nome, Integer diasTrabalhados, Double valorDia) {
        super(id, nome, diasTrabalhados, valorDia);
    }

    @Override
    public Double calcularSalario() {
        return getValorDia() * getDiasTrabalhados() * 1.10;
    }




}
