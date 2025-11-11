package _08trabalhandoComArquivos.aulas._05manipulandoPastasFile.application;

import java.io.File;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho da pasta: ");
        String caminhoPasta = sc.nextLine();


        File path = new File(caminhoPasta);

        System.out.println("PASTAS:");
        File[] pastas = path.listFiles(File::isDirectory);
        for (File pasta : pastas) {
            System.out.println(pasta);
        }


        File[] arquivos = path.listFiles(File::isFile);
        System.out.println("ARQUIVOS");{
            for (File arquivo : arquivos) {
                System.out.println(arquivo);
            }
        }


        //Criando uma subPasta a partir de um caminho escolhido
        boolean sucesso = new File(caminhoPasta + "\\subdir").mkdir();
        System.out.println("Diretorio criado com sucesso: " + sucesso);


        sc.close();
    }
}
