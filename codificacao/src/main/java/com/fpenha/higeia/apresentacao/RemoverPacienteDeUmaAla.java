package com.fpenha.higeia.apresentacao;

import com.fpenha.higeia.apresentacao.util.GerenciadorDeSessao;
import com.fpenha.higeia.apresentacao.util.LeitorDeEntrada;
import com.fpenha.higeia.dominio.modelo.Ala;
import com.fpenha.higeia.dominio.modelo.DominioException;

public class RemoverPacienteDeUmaAla implements Comando {

	@Override
	public void execute() {
		
		LeitorDeEntrada leitor = new LeitorDeEntrada();
		GerenciadorDeSessao sessao = GerenciadorDeSessao.getInstance();
		Ala ala = (Ala) sessao.recuperaDadoDaSessao(GerenciadorDeSessao.ALA_ARMAZENADA);
		
		try {
			ala.remover();
		} catch (DominioException e) {
			leitor.apresente("\n\nErro : "+e.getMessage()+"\n");
		}

	}

	@Override
	public String descricao() {
		return "Remover Paciente De Uma Ala";
	}

}
