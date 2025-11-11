package trabalhandoComArquivos.exercicios._01TesteProdutos.application;

import trabalhandoComArquivos.exercicios._01TesteProdutos.model.entites.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        String path = "c:\\ex\\produtos.csv";
        List<Produto> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path)) ) {

            String linha = br.readLine();

            while(linha != null) {

                String[] campos = linha.split(",");

                String nome = campos[0];
                double preco = Double.parseDouble(campos[1]);
                int  quantidade = Integer.parseInt(campos[2]);

                Produto produto = new Produto(nome, preco, quantidade);
                lista.add(produto);

                linha = br.readLine();
            }

            File sourceFile = new File(path);
            String pastaDestino = sourceFile.getParent() + "\\out";
            File novaPasta = new File(pastaDestino);

            if(!novaPasta.exists()) {
                novaPasta.mkdir();
            }

            String caminhoDestino = pastaDestino + "\\summary.csv";

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoDestino))) {

                for(Produto produto : lista) {
                    bw.write(produto.getNome() + "," + String.format("%.2f",produto.somarValorTotal()));
                    bw.newLine();
                }

            }
            catch(IOException e) {
                System.out.println("erro ao escrever arquivo: "+e.getMessage());
            }


        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
}
