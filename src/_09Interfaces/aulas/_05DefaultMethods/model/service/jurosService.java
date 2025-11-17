package _09Interfaces.aulas._05DefaultMethods.model.service;

import java.security.InvalidParameterException;

public interface jurosService {

    double getTaxaJuros();

    default double pagamento(double valor, int meses){
        if(meses < 1){
            throw new InvalidParameterException("Erro ao informar o mes: quantidade de meses precisa ser maior que zero");
        }
        return valor * Math.pow(1.0 + this. getTaxaJuros() / 100.0, meses);

    }

}
