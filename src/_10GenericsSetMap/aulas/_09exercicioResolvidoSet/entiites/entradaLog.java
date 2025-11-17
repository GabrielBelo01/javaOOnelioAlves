package _10GenericsSetMap.aulas._09exercicioResolvidoSet.entiites;

import java.util.Date;
import java.util.Objects;

public class entradaLog {
    private String nome;
    private Date dataEntrada;

    public entradaLog(String nome, Date dataEntrada) {
        this.nome = nome;
        this.dataEntrada = dataEntrada;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        entradaLog that = (entradaLog) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }


}
