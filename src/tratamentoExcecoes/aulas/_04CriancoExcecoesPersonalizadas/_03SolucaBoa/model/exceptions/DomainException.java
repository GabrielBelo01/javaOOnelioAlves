package tratamentoExcecoes.aulas._04CriancoExcecoesPersonalizadas._03SolucaBoa.model.exceptions;

public class DomainException extends RuntimeException {
    private  static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }


}
