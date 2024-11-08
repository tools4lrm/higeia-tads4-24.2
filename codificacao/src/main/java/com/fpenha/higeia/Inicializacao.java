package com.fpenha.higeia;

import com.fpenha.higeia.apresentacao.AdicionarPacienteEmUmLeitoDaAla;
import com.fpenha.higeia.apresentacao.Comando;
import com.fpenha.higeia.apresentacao.CriarAlaComTamanhoFixo;
import com.fpenha.higeia.apresentacao.Menu;
import com.fpenha.higeia.apresentacao.RemoverPacienteDeUmaAla;
import com.fpenha.higeia.apresentacao.util.GerenciadorDeSessao;

public class Inicializacao {

	public static void main(String[] args) {
		
		Menu menu = new Menu(3);
		
		Comando criarAla = new CriarAlaComTamanhoFixo();  
		Comando adicionarPacienteNaAla = new AdicionarPacienteEmUmLeitoDaAla();
		Comando removerPacienteDaAla = new RemoverPacienteDeUmaAla();
				
		menu.adicionarComando(0, criarAla);
		menu.adicionarComando(1, adicionarPacienteNaAla);
		menu.adicionarComando(2, removerPacienteDaAla);
		
		menu.apresentarEExecutar();
	}

}
