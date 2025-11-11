package _08trabalhandoComArquivos.exercicios._04Funcionarios.application;


import _08trabalhandoComArquivos.exercicios._04Funcionarios.mode.entities.PessoaFisica;
import _08trabalhandoComArquivos.exercicios._04Funcionarios.mode.entities.PessoaJuridica;
import _08trabalhandoComArquivos.exercicios._04Funcionarios.mode.entities.Funcionarios;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionarios> listaPF = new ArrayList<>();
        List<Funcionarios> listaPJ = new ArrayList<>();


        //C:\Funcionarios\listaFuncionarios.csv
        System.out.print("Digite o arquivo de origem: ");
        String arquivoOrigemStg = sc.nextLine();
        File arquivoOrigem = new File(arquivoOrigemStg);

        //Pega o caminho da Pasta e despreza o nome
        String caminhoPastaOrigemStg = arquivoOrigem.getParent();

        File pastaPF = new File(caminhoPastaOrigemStg + "\\PessoaFisica");
        File pastaPJ = new  File(caminhoPastaOrigemStg + "\\PessoaJuridica");

        if (!pastaPF.exists()) {
            pastaPF.mkdir();
        }

        if (!pastaPJ.exists()) {
            pastaPJ.mkdir();
        }

        File arquivoPF = new File(pastaPF +"\\listaPessoaFisica.csv");
        File arquivoPJ = new File(pastaPJ +"\\listaPessoaJuridica.csv");



        try(BufferedReader br = new BufferedReader(new FileReader(arquivoOrigem))){

            String funcionarios = br.readLine();

            while(funcionarios!=null){

                String[] campos = funcionarios.split(",");
                Integer id = Integer.parseInt(campos[0]);
                String nome = campos[1];
                Integer qtdDiasTrabalhados = Integer.parseInt(campos[2]);
                Double valorDiasTrabalhado = Double.parseDouble(campos[3]);

                if(id == 1) listaPF.add(new PessoaFisica(id, nome, qtdDiasTrabalhados, valorDiasTrabalhado));
                else listaPJ.add(new PessoaJuridica(id, nome, qtdDiasTrabalhados, valorDiasTrabalhado));

                funcionarios = br.readLine();

            }


            try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoPF))){

                for(Funcionarios f : listaPF){
                    bw.write(f.toString());
                    bw.newLine();
                }
            }
            catch(IOException e){
                System.out.println("Erro escrevendo no ARQUIVO PF: "+e.getMessage());
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoPJ))){
                for(Funcionarios f : listaPJ){
                    bw.write(f.toString());
                    bw.newLine();
                }
            }
            catch(IOException e){
                System.out.println("Erro escrevendo no ARQUIVO PJ: "+e.getMessage());
            }

        }
        catch (IOException e){
            System.out.println("Erro lendo ARQUIVO ORIGEM: "+e.getMessage());
        }



    }
}
