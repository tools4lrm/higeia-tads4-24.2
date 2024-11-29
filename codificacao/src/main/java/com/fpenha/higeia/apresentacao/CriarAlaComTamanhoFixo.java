package com.fpenha.higeia.apresentacao;

import com.fpenha.higeia.apresentacao.util.LeitorDeEntrada;
import com.fpenha.higeia.dominio.modelo.Ala;
import com.fpenha.higeia.dominio.modelo.DominioException;
import com.fpenha.higeia.dominio.modelo.Hospital;

public class CriarAlaComTamanhoFixo implements Comando {

	@Override
	public void execute() {
	
		boolean problemaNaCriacao = true;
		
		do {
			LeitorDeEntrada leitor = new LeitorDeEntrada();
			
			try {

				Hospital hospital = Hospital.getInstancia();
				
				leitor.apresente("Veja a estrutura do Hopital até o momento: \n");
				leitor.apresente(hospital.toString());

				int ambienteEscolhido = leitor.leiaInt("\n\nInforme o ambiente no qual queres intanciar uma Ala: ");
				int quantidadeDeLeitos = leitor.leiaInt("Informe a quantidade de Leitos da Ala : ");
				String nomeDaAla = leitor.leiaString("Informe o nome da Ala que deseja criar : ");
				Ala ala = new Ala(nomeDaAla, quantidadeDeLeitos);
				
				hospital.inserir(ala, ambienteEscolhido);
				
				
				leitor.apresente(hospital.toString());
				
				problemaNaCriacao = false;
			} catch (DominioException e) {
				leitor.apresente("\n\nErro : "+e.getMessage()+"\n");
				leitor.apresente("Por favor, verfique o erro e tente novamente!!\n\n");
			}
	
			
		} while (problemaNaCriacao);
		
		
		
	
	}

	@Override
	public String descricao() {
		return "Criar Ala Com Tamanho Fixo";
	}

}
