package com.fpenha.higeia.apresentacao;

import com.fpenha.higeia.apresentacao.util.GerenciadorDeAlas;
import com.fpenha.higeia.apresentacao.util.LeitorDeEntrada;
import com.fpenha.higeia.dominio.modelo.Ala;
import com.fpenha.higeia.dominio.modelo.DominioException;

public class CriarAlaComTamanhoFixo implements Comando {

	@Override
	public void execute() {

		boolean problemaNaCriacao = true;
		
		do {
			LeitorDeEntrada leitor = new LeitorDeEntrada();
			int quantidadeDeLeitos = leitor.leiaInt("Informe a quantidade de Leitos da Ala : ");
			String nomeDaAla = leitor.leiaString("Informe o nome da Ala que deseja criar : ");
			
			try {
				Ala ala = new Ala(nomeDaAla, quantidadeDeLeitos);
				GerenciadorDeAlas sessao = GerenciadorDeAlas.getInstance();
				sessao.configuraDadoParaSessao(GerenciadorDeAlas.ALA_ARMAZENADA, ala);
				
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
