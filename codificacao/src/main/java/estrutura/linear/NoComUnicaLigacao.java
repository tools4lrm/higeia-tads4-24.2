package estrutura.linear;


public class NoComUnicaLigacao {

	public Processo processo;
	public NoComUnicaLigacao proximo;

    public NoComUnicaLigacao(Processo processo) {
        this.processo = processo;
        this.proximo = null;
    }
	
}
