package _10GenericsSetMap.exercicios.exercicioSet.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("Quantos estudante no curso A? ");
        int qtdA = sc.nextInt();
        for (int i = 0; i < qtdA; i++) {
            a.add(sc.nextInt());
        }
        System.out.print("Quantos estudante no curso B? ");
        int qtdB = sc.nextInt();
        for (int i = 0; i < qtdB; i++) {
            b.add(sc.nextInt());
        }
        System.out.print("Quantos estudante no curso C? ");
        int qtdC = sc.nextInt();
        for (int i = 0; i < qtdC; i++) {
            c.add(sc.nextInt());
        }

        Set<Integer> alunos = new HashSet<>(a);
        alunos.addAll(b);
        alunos.addAll(c);

        System.out.println("Total dos estudantes: " + alunos.size());


        sc.close();
    }
}
