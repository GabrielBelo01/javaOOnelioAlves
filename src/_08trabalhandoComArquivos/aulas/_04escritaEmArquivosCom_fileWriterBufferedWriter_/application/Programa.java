package _08trabalhandoComArquivos.aulas._04escritaEmArquivosCom_fileWriterBufferedWriter_.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa {
    public static void main(String[] args) {


        String[] linhas = new String[] {"Good morning", "Good afternoon", "Good nigh"};

        String path = "c:\\temp\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String l : linhas) {
                bw.write(l);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
