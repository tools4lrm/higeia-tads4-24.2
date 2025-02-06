package estrutura.linear.fila;

import estrutura.linear.Processo;

public class Fila {

	public Processo processoAtual;
	public Fila proximaFila;
	
	public Fila() {
		this.processoAtual = null;
		this.proximaFila = null;
	}
	
	public void inserirfila(Processo processoNovo) {

	}
	public Processo removerfila() {
		Processo removido = this.processoAtual;
		this.processoAtual = this.proximaFila.processoAtual;
		this.proximaFila = this.proximaFila.proximaFila;
		return removido;
	}
	

	
	public boolean vaziafila() {
		if(this.proximaFila == null) {
			return true;
		}
		return false;
	}
}
