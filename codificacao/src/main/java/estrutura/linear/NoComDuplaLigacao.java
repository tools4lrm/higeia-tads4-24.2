package estrutura.linear;


public class NoComDuplaLigacao {

    public Processo processo;
    public NoComDuplaLigacao anterior;
    public NoComDuplaLigacao proximo;

    public NoComDuplaLigacao(Processo processo) {
        this.processo = processo;
        this.anterior = null;
        this.proximo = null;
    }
}
