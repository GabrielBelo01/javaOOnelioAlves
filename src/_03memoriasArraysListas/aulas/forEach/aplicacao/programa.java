package forEach.aplicacao;

public class programa {
    public static void main(String[] args) {

        String[] vetor = new String[] {"Maria","Bob","Alex"};
        int[] numeros = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};


        for(int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }

        for(String str : vetor){ // 1° O tipo do vetor, 2° criar um "apelido", 3° o nome do vetor
            System.out.println(str);
        }

        for(int num : numeros){
            if (num == 13){
                System.out.println("Faz o L");
            } else {
                System.out.println(num);
            }


        }

    }
}
