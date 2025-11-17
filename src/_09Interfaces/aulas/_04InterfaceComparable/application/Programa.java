package _09Interfaces.aulas._04InterfaceComparable.application;

import _09Interfaces.aulas._04InterfaceComparable.entities.Funcionarios;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        List<Funcionarios> lista = new ArrayList<>();
        String caminho = "C:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String funcionariosCsv = br.readLine();
            while (funcionariosCsv != null) {
                String[] campos = funcionariosCsv.split(",");
                lista.add(new Funcionarios(campos[0], Double.parseDouble(campos[1])));
                funcionariosCsv = br.readLine();
            }

            Collections.sort(lista);
            for (Funcionarios s : lista) {
                System.out.println(s.getNome() + " - " + s.getSalario());
            }


        } catch (IOException e){
            System.out.println("Erro: "+e.getMessage());
        }

    }
}
