package _06herencaPolimorfismo.aulas._06ExercicioResolvido.programa;

import _06herencaPolimorfismo.aulas._06ExercicioResolvido.classes.Funcionarios;
import _06herencaPolimorfismo.aulas._06ExercicioResolvido.classes.FuncionariosTercerizados;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionarios> lista = new ArrayList<>();

        System.out.print("Digite a quantidade de funcioanrios: ");
        int n = sc.nextInt();


        for(int i = 0; i < n; i++){

            System.out.println("Dados do #" + (1+i) + "° funcionario:");
            System.out.print("Tercerizado(s/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por horas: ");
            double valorPorHora = sc.nextDouble();

            if (ch == 's'){
                System.out.print("Despesa Adicional: ");
                double valorDespesa = sc.nextDouble();

                lista.add(new FuncionariosTercerizados(nome, horas, valorPorHora, valorDespesa));
            } else {
                lista.add(new Funcionarios(nome, horas, valorPorHora));
            }

        }

        System.out.println();
        System.out.println("Pagamentos: ");
        for (Funcionarios f : lista){
            System.out.println(f.getNome() +  " - $ " + String.format("%.2f", f.pagamento()));
        }

        sc.close();
    }
}
