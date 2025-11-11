package _08trabalhandoComArquivos.exercicios._02TesteProdutos.application;

import _08trabalhandoComArquivos.exercicios._02TesteProdutos.model.entites.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produto> lista = new ArrayList<>();

        System.out.print("Digite o caminho de do arquivo: ");
        String arquivoOrigem = sc.nextLine();
        File arquivo = new File(arquivoOrigem);

        //Pega o caminho da PASTA onde esta o arquivo
        String caminhoPasta = arquivo.getParent();

        //Represta um PASTA mas não cria ela
        File pastaOut = new File(caminhoPasta + "\\out");
        if(!pastaOut.exists()){
            //AQUI sim ela esta sendo criada
            pastaOut.mkdir();
        }



        //Representa um ARQUIVO mas nao cria ele
        File arquivoSaida = new File(pastaOut+ "\\summary.csv");


        try(BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

            String itensCsv = br.readLine();
            while(itensCsv != null){

                String[] campos = itensCsv.split(",");

                String nome = campos[0];
                Double preco = Double.parseDouble(campos[1]);
                Integer quantidade = Integer.parseInt(campos[2]);

                lista.add(new Produto(nome, preco, quantidade));

                itensCsv = br.readLine();

            }

          //AQUI que é criado o Arquivo
          try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoSaida))) {

              for(Produto p :  lista){
                  bw.write(p.toString());
                  bw.newLine();
              }

          }
          catch(IOException e){
              System.out.println("Erro ao escrever no arquivo de saida: ");
          }

        }
        catch (IOException e){
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }


        sc.close();
    }
}
