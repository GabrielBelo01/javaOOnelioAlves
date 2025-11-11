package enumeracoesComposicao.aulas.composicaoTrabalhador.programa;

import enumeracoesComposicao.aulas.composicaoTrabalhador.classes.ContratoPorHora;
import enumeracoesComposicao.aulas.composicaoTrabalhador.classes.Departamento;
import enumeracoesComposicao.aulas.composicaoTrabalhador.classes.Trabalhador;
import enumeracoesComposicao.aulas.composicaoTrabalhador.classes.enums.NivelDoTrabalhador;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        System.out.println("Digite os dados do trabalhador: ");
        System.out.print("Nome: ");
        String nomeTrabalhador = sc.nextLine();
        System.out.print("Nivel: ");
        String nivelTrabalhador = sc.nextLine();
        System.out.print("Salario Base: ");
        double salarioBase = sc.nextDouble();

        Trabalhador trabalhador1 = new Trabalhador(nomeTrabalhador, NivelDoTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));

        System.out.println("Quantos contratos: ");
        int n =  sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite os dados do contrato #"+i);
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();
            System.out.print("Duração (horas): ");
            int horas = sc.nextInt();
            ContratoPorHora contrato = new ContratoPorHora(dataContrato, valorHora, horas);
            trabalhador1.addContrato(contrato);
        }

        System.out.print("Entre com o mes e o ano do contrato a ser consultado(MM/YYYY): ");
        String mesEano = sc.next();
        int mes = Integer.parseInt(mesEano.substring(0,2));
        int ano = Integer.parseInt(mesEano.substring(3));

        System.out.println("Nome: "+ trabalhador1.getNome());
        System.out.println("Departamento: "+ trabalhador1.getDepartamento().getNome());
        System.out.println("Renda total de " + mesEano + ": " + String.format("%.2f", trabalhador1.renda(ano,mes)));


        sc.close();
    }
}
