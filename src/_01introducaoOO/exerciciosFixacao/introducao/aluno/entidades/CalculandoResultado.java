package exerciciosFixacao.introducao.aluno.entidades;

public class CalculandoResultado {
    public String nome;
    public double n1;
    public double n2;
    public double n3;

    public void calcularResultado(){
       double resultado = n1 + n2 + n3;
        System.out.printf("Resultado: %.2f" , resultado);
        System.out.println();

       if(resultado >= 60){
           System.out.println("Passou de ano");
       } else {

           System.out.println("Reprovou de ano");
           double faltou = 60 - resultado;
           System.out.printf("Faltaram: %.2f para passar",faltou);
       }

    }


}
