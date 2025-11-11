package vetoresExerciciosFixacao.desafioPensionato.aplicacao;

import vetoresExerciciosFixacao.desafioPensionato.entidades.aluguel;

import java.util.Locale;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        String nome,email;
//        int escolhaQuarto;
//
//
//        int quartos[] = new int[10];
//
//        System.out.println("Quantos quartos vão ser alugados?");
//        int quantidadeQuartos = sc.nextInt();
//
//        for(int i = 0; i < quantidadeQuartos; i++){
//
//            System.out.println("Nome do estudante:");
//            nome = sc.next();
//            System.out.println("Email do estudante:");
//            email = sc.next();
//            System.out.println("Qual quarto??");
//            escolhaQuarto = sc.nextInt();
//            quartos[escolhaQuarto] = escolhaQuarto;
//
//
//        }
//
//        for(int i = 0; i < quantidadeQuartos; i++){
//
//        }


        aluguel[] quartos = new aluguel[10];

        System.out.println("Qual a quantidade de quartos?");
        int quantidade = sc.nextInt();

        for (int i=0;i<quantidade;i++){
            System.out.println("Aluguel #"+(i+1)+":");
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Quarto: ");
            int quartoNumero = sc.nextInt();


           quartos[quartoNumero] = new aluguel(nome,email);
        }

        for (int i=0;i<10;i++){
            if(quartos[i]!=null){
                System.out.println(quartos[i].getNome());
                System.out.println(quartos[i].getEmail());
            }
        }

        sc.close();
    }
}
