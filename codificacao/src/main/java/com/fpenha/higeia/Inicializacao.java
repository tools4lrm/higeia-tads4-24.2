package com.fpenha.higeia;

import com.fpenha.higeia.apresentacao.AdicionarPacienteEmUmLeitoDaAla;
import com.fpenha.higeia.apresentacao.Comando;
import com.fpenha.higeia.apresentacao.CriarAlaComTamanhoFixo;
import com.fpenha.higeia.apresentacao.Menu;
import com.fpenha.higeia.apresentacao.Sair;
import com.fpenha.higeia.dominio.modelo.DominioException;
import com.fpenha.higeia.dominio.modelo.Hospital;

public class Inicializacao {

	public static void main(String[] args) throws DominioException {

		Hospital.configurarHospitalParaSessao("Hospital FPenha", 5);
		
		Menu menu = new Menu(3);
		Comando sairDoPrograma = new Sair();
		Comando criarAlaComTamanhoFixo = new CriarAlaComTamanhoFixo();  
		Comando adicionarPacienteNaAla = new AdicionarPacienteEmUmLeitoDaAla();
//		Comando removerPacienteDaAla = new RemoverPacienteDeUmaAla();
				
		menu.adicionarComando(0, sairDoPrograma);
		menu.adicionarComando(1, criarAlaComTamanhoFixo);
		menu.adicionarComando(2, adicionarPacienteNaAla);
//		menu.adicionarComando(3, removerPacienteDaAla);
		
		menu.apresentarEExecutar();
	}

}
