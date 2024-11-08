package com.fpenha.higeia.apresentacao;

import com.fpenha.higeia.apresentacao.util.LeitorDeEntrada;

/**
 * A class Menu mantém o mapeamento de opções disponíveis da aplicação para os comandos implementados, 
 * exibindo-as dinamicamente e executando o comando selecionado.
 */
public class Menu {
	
	private LeitorDeEntrada leitorDeEntrada = null;
	private Comando[] comandos = null;
	
	public Menu (int quantidadeDeComandos) {
		
		leitorDeEntrada = new LeitorDeEntrada();
		comandos = new Comando[quantidadeDeComandos];
	}

	public void adicionarComando(int posicao, Comando comando) {
		comandos[posicao] = comando;		
	}
	
	public Comando adicionarComando(int posicao) {
		return comandos[posicao];		
	}
	
    public void apresentarEExecutar() {
        
    	leitorDeEntrada.apresente("Escolha a opção : \n\n");
        for (int i = 0; i < comandos.length; i++) {
        	leitorDeEntrada.apresente(i + " - " + comandos[i].descricao() + "\n");
		}
        
        int escolha = leitorDeEntrada.leiaInt("\nDigite a opção desejada : ");
        Comando comando = comandos[escolha];
        if(comando != null) {
        	comando.execute();
        	apresentarEExecutar();
        }
    }
	
}
