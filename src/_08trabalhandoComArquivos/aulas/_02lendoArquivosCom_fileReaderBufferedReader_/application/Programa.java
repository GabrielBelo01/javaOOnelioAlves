package _08trabalhandoComArquivos.aulas._02lendoArquivosCom_fileReaderBufferedReader_.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa {
    public static void main(String[] args) {

        String path = "c:\\temp\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String linha = br.readLine();

            while(linha != null){
                System.out.println(linha);
                linha = br.readLine();
            }

        }
        catch (IOException e){
            System.out.println("Errp: "+ e.getMessage());
        }
        finally{
            try {
                if(br != null){
                    br.close();
                }

                if(fr != null){
                    fr.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }

    }
}
