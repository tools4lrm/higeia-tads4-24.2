package com.fpenha.higeia.dominio.modelo;

public class Prioridade {

	public int gravidadeDaSituacao = -1;
	public boolean gestante = false;
	public int idade = -1;
	
	public Prioridade(int gravidadeDaSituacao, boolean gestante, int idade) {
		super();
		
		this.gravidadeDaSituacao = gravidadeDaSituacao;
		this.gestante = gestante;
		this.idade = idade;
		
	}
	

	public boolean maiorQue(Prioridade outra) {
		
		
		
		return false;
	}
	
	
}
