package listaExercicioFixacao.programa;

import listaExercicioFixacao.entidades.Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionarios> list = new ArrayList<>();

        System.out.println("Quantos funcionarios vão ser registrados?");
        int qtd = sc.nextInt();

        for (int i = 0; i < qtd; i++) {

            System.out.println();
            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();


            Funcionarios funcionario = new Funcionarios(id, nome, salario);

            list.add(funcionario);



        }



        System.out.println("Qual o ID do funcionario que vai ter aumento?");
        int idSalario = sc.nextInt();
        Integer pos = posicao(list, idSalario);
        if (pos == null) {
            System.out.println("Nenhum funcionario encontrado.");
        } else {
            System.out.println("Qual a porcentagem de aumento?");
            double porcentagem = sc.nextDouble();
            list.get(pos).aumentarSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionarios:");
      for (Funcionarios f : list){
          System.out.println(f);
      }


        sc.close();
    }

    public static Integer posicao(List<Funcionarios> list, int id) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }

        return null;
    }

}
