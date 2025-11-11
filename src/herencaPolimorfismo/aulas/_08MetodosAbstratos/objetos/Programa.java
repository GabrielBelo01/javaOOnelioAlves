package herencaPolimorfismo.aulas._08MetodosAbstratos.objetos;

import herencaPolimorfismo.aulas._08MetodosAbstratos.classes.Circulo;
import herencaPolimorfismo.aulas._08MetodosAbstratos.classes.Forma;
import herencaPolimorfismo.aulas._08MetodosAbstratos.classes.Retangulo;
import herencaPolimorfismo.aulas._08MetodosAbstratos.classes.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Forma> lista = new ArrayList<>();

        System.out.print("Digite o numero de formas: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados da forma: " + i);
            System.out.print("Retangulo ou circulo (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Cor (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                System.out.print("Largura: ");
                double largura = sc.nextDouble();

                lista.add(new Retangulo(color,largura,altura));

            } else {
                System.out.print("Raio: ");
                double raio = sc.nextDouble();

                lista.add(new Circulo(color,raio));
            }

        }

        System.out.println("Area das formas: ");
            for (Forma f : lista) {
                System.out.println(String.format("%.2f", f.area()));
            }



        sc.close();
    }
}
