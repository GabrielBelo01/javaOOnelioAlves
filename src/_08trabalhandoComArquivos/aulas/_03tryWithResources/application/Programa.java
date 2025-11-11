package _08trabalhandoComArquivos.aulas._03tryWithResources.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa {
    public static void main(String[] args) {

        String path = "c:\\temp\\in.txt";

        //Garante que os recursos como BufferReader e FileReader serão fechados no final.
        try (BufferedReader br = new BufferedReader(new FileReader(path)) ) {
            String linha = br.readLine();

            while(linha != null){
                System.out.println(linha);
                linha = br.readLine();
            }

        }
        catch (IOException e){
            System.out.println("Errp: "+ e.getMessage());
        }


    }
}
