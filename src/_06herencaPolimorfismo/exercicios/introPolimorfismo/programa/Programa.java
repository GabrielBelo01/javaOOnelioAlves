package _06herencaPolimorfismo.exercicios.introPolimorfismo.programa;

import _06herencaPolimorfismo.exercicios.introPolimorfismo.classes.Produto;
import _06herencaPolimorfismo.exercicios.introPolimorfismo.classes.ProdutoImportador;
import _06herencaPolimorfismo.exercicios.introPolimorfismo.classes.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Produto> lista = new ArrayList<>();

        System.out.print("Digite o numero de produtos: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Produto numero: "+i);
            System.out.print("Comum, usado, ou importador (c/u/i)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();


            switch (ch){
                case 'c':
                    lista.add(new Produto(nome, preco));
                    break;
                case 'u':
                    System.out.print("Data de fabricação (DD/MM/YYYY): ");
                    Date dataFrabricacao = sdf.parse(sc.next());
                    lista.add(new ProdutoUsado(nome, preco, dataFrabricacao));
                    break;
                case 'i':
                    System.out.print("Custo Alfandega: ");
                    double custo = sc.nextDouble();
                    lista.add(new ProdutoImportador(nome, preco, custo));
                    break;
            }

        }

        for(Produto p : lista){
            System.out.println(p.tagPreco());
        }



        sc.close();
    }
}
