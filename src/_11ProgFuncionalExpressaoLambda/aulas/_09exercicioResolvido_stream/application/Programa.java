package _11ProgFuncionalExpressaoLambda.aulas._09exercicioResolvido_stream.application;

import _11ProgFuncionalExpressaoLambda.aulas._09exercicioResolvido_stream.entities.Produto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String path = "C:\\temp\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Produto> list = new ArrayList<>();
            String linha =br.readLine();
            while(linha != null){
                String[] linhas = linha.split(",");
                list.add(new Produto(linhas[0], Double.parseDouble(linhas[1])));
                linha = br.readLine();
            }

            double media = list.stream()
                    .map(p -> p.getPreco())
                    .reduce(0.0, Double::sum) / list.size();
            System.out.println("Media de preço: "+ String.format("%.2f", media));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> nomes = list.stream()
                    .filter(p -> p.getPreco() < media)
                    .map(p -> p.getNome())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            nomes.forEach(System.out::println);


        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }


    }
}
