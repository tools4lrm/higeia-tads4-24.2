package estrutura.linear.pilha;

import estrutura.linear.Processo;

public class Pilha {

	public Processo processoAtual;
	public Pilha proximaPilha;
	
	public Pilha() {
		this.processoAtual = null;
		this.proximaPilha = null;
	}
	
	public void inserirpilha(Processo processoNovo) {
		if(this.processoAtual == null) {
			this.processoAtual = processoNovo;
			this.proximaPilha = new Pilha();
		} else {
			this.proximaPilha.inserirpilha(processoNovo);
		}
	}

	public Processo removerPilha() {
		
		return null;
	}
	
	public boolean vaziaPilha() {
		if(this.proximaPilha == null) {
			return true;
		}
		return false;
	}

}