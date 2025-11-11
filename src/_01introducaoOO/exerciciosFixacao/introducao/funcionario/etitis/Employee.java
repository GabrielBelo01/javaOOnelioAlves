package exerciciosFixacao.introducao.funcionario.etitis;

public class Employee {
    public String name;
    public double GrossSalary;
    public double tax;

    public double netSalary(){
        return GrossSalary - tax;
    }

    public void increaseSalary(double percentage){
        GrossSalary += GrossSalary * percentage / 100.0;
    }

}
