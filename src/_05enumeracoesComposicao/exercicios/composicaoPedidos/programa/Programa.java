package _05enumeracoesComposicao.exercicios.composicaoPedidos.programa;

import _05enumeracoesComposicao.exercicios.composicaoPedidos.classes.Cliente;
import _05enumeracoesComposicao.exercicios.composicaoPedidos.classes.OrdemDoPedido;
import _05enumeracoesComposicao.exercicios.composicaoPedidos.classes.Pedido;
import _05enumeracoesComposicao.exercicios.composicaoPedidos.classes.Produto;
import _05enumeracoesComposicao.exercicios.composicaoPedidos.classes.enums.StatusDoPedido;

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

        System.out.println("Entre com os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de aniversario: ");
        String dataTexto = sc.nextLine();
        Date dataAniversario = sdf.parse(dataTexto);

        Cliente cliente1 = new Cliente(nome, email, dataAniversario);


        System.out.println("Digite os dados do pedido:");
        System.out.print("Status: ");
        StatusDoPedido status = StatusDoPedido.valueOf(sc.next());


        System.out.print("Quantos produtos? ");
        int quantidade = sc.nextInt();


        Pedido pedido = new Pedido(new Date(),status,cliente1);


        for (int i = 1; i <= quantidade; i++) {

            sc.nextLine();
            System.out.println("Digite os dados do #"+ i +"° produto:");
            System.out.print("Nome do produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            double precoProduto = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidadeProduto = sc.nextInt();

            Produto produto = new Produto(precoProduto,nomeProduto);

            OrdemDoPedido ordemDoPedido = new OrdemDoPedido(quantidadeProduto, produto,precoProduto);

            pedido.addItem(ordemDoPedido);

        }


        System.out.println(pedido);


        sc.close();
    }
}
