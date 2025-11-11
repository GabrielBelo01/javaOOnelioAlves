package vetoresExerciciosFixacao.problemaMaisVelho;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas voce vai digitar? ");
        int tot = sc.nextInt();

        String nome[] = new String[tot];
        int idade[] = new int[tot];

        String nomePessoaVelho = "";
        int idadePessoaVelho = 0;
        
        
        for(int i=0;i<tot;i++){
            System.out.println("Dados da "+(i+1)+"a pessoa");
            System.out.print("Nome: ");
            nome[i]=sc.next();
            System.out.print("Idade: ");
            idade[i]=sc.nextInt();
            
            if(idade[i]>idadePessoaVelho){
                nomePessoaVelho=nome[i];
                idadePessoaVelho=idade[i];
            }
            
        }

        System.out.println("Pessoa mais velha: "+nomePessoaVelho);




        sc.close();
    }
}
