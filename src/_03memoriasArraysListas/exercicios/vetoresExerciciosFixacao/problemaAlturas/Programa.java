package vetoresExerciciosFixacao.problemaAlturas;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numerosPessoas;
        int cc = 0;
        float mediaAltura = 0.0f;
        float porcIdade;

        System.out.println("Quantas pessoa serao digitadas? ");
        numerosPessoas = sc.nextInt();


        String nome[] = new String[numerosPessoas];
        int idade[] = new  int[numerosPessoas];
        float altura[] = new float[numerosPessoas];

        for(int i=0;i<numerosPessoas;i++){
            System.out.println("Dados da "+(i+1) +"a pessoa");
            System.out.print("Nome: ");
            nome[i]=sc.next();
            System.out.print("Idade: ");
            idade[i]=sc.nextInt();
            System.out.print("Altura: ");
            altura[i]=sc.nextFloat();

            mediaAltura += altura[i];

            if (idade[i] < 16){
                cc++;
            }

        }

        mediaAltura = mediaAltura/numerosPessoas;
        System.out.printf("Altura Média: %.2f%n",mediaAltura);

        porcIdade = (cc * 100) / numerosPessoas;
        System.out.println("Pessoa com menos de 16 anos: "+porcIdade);

        for (int i=0;i<numerosPessoas;i++){
            if(idade[i]<16){
                System.out.println(nome[i]);
            }
        }

    }
}
