package _07tratamentoExcecoes.aulas._04CriancoExcecoesPersonalizadas._01SolocucaoMuitoRuim.classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private Integer numeroQuarto;
    private Date checkin;
    private Date checkout;

    private static  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(){}

    public Reserva(Integer numeroQuarto, Date checkin, Date checkout) {
        this.numeroQuarto = numeroQuarto;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getCheckin() {
        return checkin;
    }


    public Date getCheckout() {
        return checkout;
    }


    public long duracao(){
        long diferenca = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }


    public void updateDatas(Date checkin, Date checkout){
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString(){
        return "Quarto "
                + numeroQuarto
                + ", check - in "
                + sdf.format(checkin)
                + ", check - out "
                + sdf.format(checkout)
                + ", "
                + duracao()
                + " dias";
    }

}
