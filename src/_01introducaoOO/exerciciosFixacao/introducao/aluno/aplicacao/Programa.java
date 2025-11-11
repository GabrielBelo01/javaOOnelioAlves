package _01introducaoOO.exerciciosFixacao.introducao.aluno.aplicacao;

import exerciciosFixacao.introducao.aluno.entidades.CalculandoResultado;

public class Programa {
    public static void main(String[] args) {
        CalculandoResultado aluno = new CalculandoResultado();
        aluno.nome = "Alex Green";
        aluno.n1 = 27.00;
        aluno.n2 = 31.00;
        aluno.n3 = 32.00;

        aluno.calcularResultado();

        CalculandoResultado aluno2 = new CalculandoResultado();
        aluno2.nome = "Green Alex";
        aluno2.n1 = 17.00;
        aluno2.n2 = 20.00;
        aluno2.n3 = 15.00;

        aluno2.calcularResultado();
    }
}
