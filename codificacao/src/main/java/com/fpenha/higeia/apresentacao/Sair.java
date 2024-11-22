package com.fpenha.higeia.apresentacao;

public class Sair implements Comando {

	@Override
	public void execute() {
		System.exit(0);
		
	}

	@Override
	public String descricao() {
		return "Sair do Programa";
	}

}
