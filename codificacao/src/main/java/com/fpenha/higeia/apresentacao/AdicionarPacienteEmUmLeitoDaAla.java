package com.fpenha.higeia.apresentacao;

import com.fpenha.higeia.apresentacao.util.LeitorDeEntrada;
import com.fpenha.higeia.dominio.modelo.Ala;
import com.fpenha.higeia.dominio.modelo.DominioException;
import com.fpenha.higeia.dominio.modelo.Hospital;
import com.fpenha.higeia.dominio.modelo.Leito;
import com.fpenha.higeia.dominio.modelo.Paciente;

public class AdicionarPacienteEmUmLeitoDaAla implements Comando {

	@Override
	public void execute() {
		
		boolean problemaNaCriacao = true;
		
		do {
			LeitorDeEntrada leitor = new LeitorDeEntrada();

			try {
			
				Hospital hospital = Hospital.getInstancia();
				
				leitor.apresente("Visualize as Alas Definidas e escolha ala o paciente deverá ser alocado!\n");
				leitor.apresente(hospital.toString());
	
				int numeracaoDeAla = leitor.leiaInt("Digite a numeração da ala desejada: \n");
				Ala alaEscolhida = hospital.buscar(numeracaoDeAla);
				
				String nomeDoPaciente = leitor.leiaString("Digite o nome do Paciente: \n");
				String CPF = leitor.leiaString("Digite o CPF do Paciente:\n");
				Paciente paciente = new Paciente(nomeDoPaciente, CPF);
				
				Leito leitoOcupado = new Leito("", paciente);
				
				leitor.apresente("Visualize as localização dos leitos disponíveis !\n");
				leitor.apresente(alaEscolhida.toString());
	
				int numeracaoDoLeito = leitor.leiaInt("Digite a localização de um leito disponível : \n");
				alaEscolhida.inserir(leitoOcupado, numeracaoDoLeito);
				
				leitor.apresente("Visualize as localização dos leitos disponíveis !\n");
				leitor.apresente(alaEscolhida.toString());
			
			} catch (DominioException e) {
				leitor.apresente("\n\nErro : "+e.getMessage()+"\n");
				leitor.apresente("Por favor, verfique o erro e tente novamente!!\n\n");
			}
			
		} while (problemaNaCriacao);

	}

	@Override
	public String descricao() {
		return "Adicionar Paciente em um Leito da Ala";
	}

}
