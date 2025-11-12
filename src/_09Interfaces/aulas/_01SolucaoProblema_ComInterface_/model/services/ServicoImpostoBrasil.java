package _09Interfaces.aulas._01SolucaoProblema_ComInterface_.model.services;

public class ServicoImpostoBrasil implements ServicoImposto {

    @Override
    public double imposto(double valor) {
        if (valor <= 100.0) {
            return valor * 0.20;
        }
        else{
            return valor * 0.15;
        }

    }
}
