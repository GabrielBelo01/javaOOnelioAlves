package trabalhandoComArquivos.exercicios._03SomaParImpar.application;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        List<Integer> listaPar = new ArrayList<>();
        List<Integer> listaImpar = new ArrayList<>();

        String caminho = "c:\\exercicio\\numeros.txt";

        File caminhoArquivo = new File(caminho);


        File pastaPar = new  File(caminhoArquivo.getParent()+"\\Par");
        File pastaImpar = new  File(caminhoArquivo.getParent()+"\\Impar");

        if(!pastaPar.exists()){
            pastaPar.mkdir();
        }

        if(!pastaImpar.exists()){
            pastaImpar.mkdir();
        }


        File arquivoPar = new File(pastaPar,"par.txt");
        File arquivoImpar = new File(pastaImpar,"impar.txt");




        try(BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))){

            String linha = br.readLine();
            while(linha != null){

                Integer numero = Integer.parseInt(linha);
                if(numero % 2 == 0 ){
                    listaPar.add(numero);
                } else {
                    listaImpar.add(numero);
                }

                linha = br.readLine();
            }


            try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoPar))) {
                for (Integer numero : listaPar) {
                    bw.write(numero.toString());
                    bw.newLine();
                }
            }
            catch (IOException e) {
                System.out.println("Erro ao criar o arquivo par: "+e.getMessage());
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoImpar))) {
                for (Integer numero : listaImpar) {
                    bw.write(numero.toString());
                    bw.newLine();
                }
            }
            catch (IOException e) {
                System.out.println("Erro ao criar o arquivo impar: " + e.getMessage());
            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
