package _06herencaPolimorfismo.exercicios.classeMetodosAbstratos.programa;

import _06herencaPolimorfismo.exercicios.classeMetodosAbstratos.classes.Contribuintes;
import _06herencaPolimorfismo.exercicios.classeMetodosAbstratos.classes.PessoaFisica;
import _06herencaPolimorfismo.exercicios.classeMetodosAbstratos.classes.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Contribuintes> lista = new ArrayList();
        System.out.print("Informe o numero de contribuintes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Contribuintes " + i + ":");
            System.out.print("Individual ou empresarial (i/c)? ");
            char ch  = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            double renda = sc.nextDouble();

            if (ch == 'i'){
                System.out.print("Despesas com saude: ");
                double gastosSaude = sc.nextDouble();
                lista.add(new PessoaFisica(nome, renda, gastosSaude));
            } else {
                System.out.print("Numero de funcionarios: ");
                int funcionarios = sc.nextInt();
                lista.add(new PessoaJuridica(nome, renda, funcionarios));
            }

        }

            double soma = 0;
        for (Contribuintes c : lista) {
            soma += c.calcularImposto();
            System.out.println(c.getNome()+": $ "+String.format("%.2f" , c.calcularImposto()));
        }

        System.out.print("TOTAL DE IMPOSTOS: "+soma);


        sc.close();
    }
}
