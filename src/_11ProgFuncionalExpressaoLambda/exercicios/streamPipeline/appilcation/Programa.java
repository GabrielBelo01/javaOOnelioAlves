package _11ProgFuncionalExpressaoLambda.exercicios.streamPipeline.appilcation;

import _11ProgFuncionalExpressaoLambda.exercicios.streamPipeline.entities.Funcionarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String path = "C:\\temp\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Funcionarios> list = new ArrayList<>();

            String linha = br.readLine();
            while(linha != null){
                String[] linhaSplit = linha.split(",");
                list.add(new Funcionarios(linhaSplit[0],linhaSplit[1],Double.parseDouble(linhaSplit[2])));
                linha = br.readLine();
            }

            double criterioSalario = 2000.0;



            List<String> stEmail = list.stream()
                    .filter(p -> p.getSalario() > criterioSalario)
                    .map(p -> p.getEmail())
                    .sorted()
                    .collect(Collectors.toList());
            stEmail.forEach(System.out::println);

            Double sum =  list.stream()
                    .filter(p -> p.getNome().charAt(0) == 'M')
                    .map(p -> p.getSalario())
                    .reduce(0.0, Double::sum);

            System.out.println("A soma do salario dos nomes de pessoas que começam com a letra 'M' é de: " +sum);



        }
        catch (IOException e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}
