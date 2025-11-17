package _10GenericsSetMap.aulas._02GenericosDelimitados.application;

import _10GenericsSetMap.aulas._02GenericosDelimitados.model.entites.Produto;
import _10GenericsSetMap.aulas._02GenericosDelimitados.model.service.CalculandoService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Produto> lista = new ArrayList<>();

        String path = "C:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String linha = br.readLine();
            while (linha != null) {
                String[] linhaSplited = linha.split(",");
                lista.add(new Produto(linhaSplited[0], Double.parseDouble(linhaSplited[1])));
                linha = br.readLine();
            }

            Produto x = CalculandoService.max(lista);
            System.out.println("Max:");
            System.out.println(x);

        }
        catch (IOException e){
            System.out.println("Erro: "+e.getMessage());
        }

    }
}
