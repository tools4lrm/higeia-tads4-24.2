package estrutura.linear;

public class Processo {
	
	private String identificador;
	private int prioridade;

	public Processo(String identificador) {
		super();
		this.identificador = identificador;
	}
	
	public Processo (String identificador, int prioridade) {
		this (identificador);
		
		this.prioridade = prioridade;
		
	}
	
	public String getIdentificador() {
		return identificador;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

}
