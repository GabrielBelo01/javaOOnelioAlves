package herencaPolimorfismo.exercicios.introPolimorfismo.classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado  extends Produto{

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataDeFabricacao;

   public ProdutoUsado(){
       super();
   }

    public ProdutoUsado(String name, Double preco, Date dataDeFabricacao) {
        super(name, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }


    public Date getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(Date dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }


    @Override
    public String tagPreco(){
       return getName()+" (used) $ "+ getPreco() + " (Data de fabricação: "+sdf.format(getDataDeFabricacao())+")";
    }

}
