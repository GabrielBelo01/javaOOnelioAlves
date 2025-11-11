package exerciciosFixacao.introducao.funcionario.aplication;

import exerciciosFixacao.introducao.funcionario.etitis.Employee;

public class Application {
    public static void main(String[] args) {
        Employee funcionario = new Employee();
        funcionario.name = "Funcionario";
        funcionario.GrossSalary = 6000.00;
        funcionario.tax = 1000.00;

        System.out.println("Salario Liquit: " + funcionario.netSalary());

        funcionario.increaseSalary(10);
        System.out.println("Salario Liquit: " + funcionario.netSalary());
    }
}
