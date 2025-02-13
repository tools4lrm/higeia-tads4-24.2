package estrutura.linear;


public class NoComChave {

	public String cpf;

	public Processo processo;
	public NoComChave proximo;

    public NoComChave(String cpf, Processo processo) {
    	this.cpf = cpf;
        this.processo = processo;
        this.proximo = null;
    }
}
