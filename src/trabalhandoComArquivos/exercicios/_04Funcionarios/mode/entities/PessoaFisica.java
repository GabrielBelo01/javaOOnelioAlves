package trabalhandoComArquivos.exercicios._04Funcionarios.mode.entities;

public class PessoaFisica extends Funcionarios {

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(Integer id, String nome, Integer diasTrabalhados, Double valorDia) {
        super(id, nome, diasTrabalhados, valorDia);
    }

    @Override
    public Double calcularSalario() {
        return getValorDia() * getDiasTrabalhados();
    }



}
