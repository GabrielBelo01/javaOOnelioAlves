package _09Interfaces.exercicios.contratos.model.entities;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Contrato {
    private Integer numero;
    private LocalDate dataContrato;
    private Double valorTotal;

    private List<Parcelas> parcelas = new ArrayList<>();

    public Contrato() {}

    public Contrato(Integer numero, LocalDate dataContrato, Double valorTotal) {
        this.numero = numero;
        this.dataContrato = dataContrato;
        this.valorTotal = valorTotal;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Parcelas> getParcelas() {
        return parcelas;
    }

    public void addParcelas(Parcelas parcelas) {
        this.parcelas.add(parcelas);
    }

    public void removeParcelas(Parcelas parcelas) {
        this.parcelas.remove(parcelas);
    }



}
