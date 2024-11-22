package com.fpenha.higeia.apresentacao;

import com.fpenha.higeia.apresentacao.util.GerenciadorDeAlas;
import com.fpenha.higeia.apresentacao.util.LeitorDeEntrada;
import com.fpenha.higeia.dominio.modelo.Ala;
import com.fpenha.higeia.dominio.modelo.DominioException;

public class RemoverPacienteDeUmaAla implements Comando {

	@Override
	public void execute() {
		
		LeitorDeEntrada leitor = new LeitorDeEntrada();
		GerenciadorDeAlas sessao = GerenciadorDeAlas.getInstance();
		Ala ala = (Ala) sessao.recuperaDadoDaSessao(GerenciadorDeAlas.ALA_ARMAZENADA);
		
		if (ala != null) {
			
		} else {
			leitor.apresente("Crie uma Ala antes!!!!");
			leitor.limpar();
		}
		
		
	}

	@Override
	public String descricao() {
		return "Remover Paciente De Uma Ala";
	}

}
