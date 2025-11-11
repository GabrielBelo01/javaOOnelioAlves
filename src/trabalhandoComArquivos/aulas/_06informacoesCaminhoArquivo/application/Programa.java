package trabalhandoComArquivos.aulas._06informacoesCaminhoArquivo.application;

import java.io.File;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho de um arquivo: ");
        String caminhoArquivo = sc.nextLine();

        File path = new File(caminhoArquivo);

        System.out.println("getName: "+path.getName()); // Pega o nome do Arquivo
        System.out.println("getParent: "+path.getParent()); // Pega caminho e despreza o nome do arquivo
        System.out.println("getPath: "+path.getPath()); // pega o caminho inteiro até o arquivo

        sc.close();
    }
}
