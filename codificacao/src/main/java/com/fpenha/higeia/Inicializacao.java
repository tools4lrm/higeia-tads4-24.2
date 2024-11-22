package com.fpenha.higeia;

import com.fpenha.higeia.apresentacao.AdicionarPacienteEmUmLeitoDaAla;
import com.fpenha.higeia.apresentacao.Comando;
import com.fpenha.higeia.apresentacao.CriarAlaComTamanhoFixo;
import com.fpenha.higeia.apresentacao.Menu;
import com.fpenha.higeia.apresentacao.RemoverPacienteDeUmaAla;
import com.fpenha.higeia.apresentacao.Sair;

public class Inicializacao {

	public static void main(String[] args) {
		
		Menu menu = new Menu(4);

		Comando sairDoPrograma = new Sair();
		Comando criarAla = new CriarAlaComTamanhoFixo();  
		Comando adicionarPacienteNaAla = new AdicionarPacienteEmUmLeitoDaAla();
		Comando removerPacienteDaAla = new RemoverPacienteDeUmaAla();
				
		menu.adicionarComando(0, sairDoPrograma);
		menu.adicionarComando(1, criarAla);
		menu.adicionarComando(2, adicionarPacienteNaAla);
		menu.adicionarComando(3, removerPacienteDaAla);
		
		menu.apresentarEExecutar();
	}

}
