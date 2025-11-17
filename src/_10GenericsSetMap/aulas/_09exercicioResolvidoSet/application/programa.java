package _10GenericsSetMap.aulas._09exercicioResolvidoSet.application;

import _10GenericsSetMap.aulas._09exercicioResolvidoSet.entiites.entradaLog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String path = "C:\\temp\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<entradaLog> set = new HashSet<>();

            String linha = br.readLine();
            while (linha != null) {

                String[] linhaSplited = linha.split(" ");
                String nome = linhaSplited[0];
                Date momento = Date.from(Instant.parse(linhaSplited[1]));

                set.add(new entradaLog(nome, momento));

                linha = br.readLine();

            }

            System.out.println(set.size());

        }
        catch (IOException e){
            System.out.println("Erro: "+e.getMessage());
        }

        sc.close();
    }
}
