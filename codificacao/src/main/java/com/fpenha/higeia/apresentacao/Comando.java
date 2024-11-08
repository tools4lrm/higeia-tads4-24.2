package com.fpenha.higeia.apresentacao;

/**
 * A interface Comando define a operação execute que cada comando específico implementa da 
 * aplicação implementará.
 */
public interface Comando {

	/**
	 * 
	 */
	void execute();
	
	/**
	 * 
	 * @return
	 */
	String descricao();
}
