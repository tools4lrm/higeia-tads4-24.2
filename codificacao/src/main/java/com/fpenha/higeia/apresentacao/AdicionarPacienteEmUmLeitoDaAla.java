package com.fpenha.higeia.apresentacao;

import com.fpenha.higeia.apresentacao.util.GerenciadorDeSessao;
import com.fpenha.higeia.apresentacao.util.LeitorDeEntrada;
import com.fpenha.higeia.dominio.modelo.Ala;
import com.fpenha.higeia.dominio.modelo.DominioException;
import com.fpenha.higeia.dominio.modelo.Paciente;

public class AdicionarPacienteEmUmLeitoDaAla implements Comando {

	@Override
	public void execute() {
		
		LeitorDeEntrada leitor = new LeitorDeEntrada();
		GerenciadorDeSessao sessao = GerenciadorDeSessao.getInstance();
		Ala ala = (Ala) sessao.recuperaDadoDaSessao(GerenciadorDeSessao.ALA_ARMAZENADA);
		
		
		String nomeDoPaciente = leitor.leiaString("Informe o nome do Paciente : ");
		String CPF = leitor.leiaString("Informe o nome CPF do Paciente : ");
		
		Paciente paciente  = new Paciente(nomeDoPaciente, CPF);
		
		try {
			ala.inserir(paciente);
		} catch (DominioException e) {
			leitor.apresente("\n\nErro : "+e.getMessage()+"\n");
		}

	}

	@Override
	public String descricao() {
		return "Adicionar Paciente em um Leito da Ala";
	}

}
