package com.fpenha.higeia.dominio.modelo.edl;


/**
 * Classe que representará a essência de um elemento em uma estrutura.
 * 
 * @param <T> tipo da chave que identificará o elemento como único dentro de um conjunto.
 */
public interface Dado<T> {

	 String getDescricao();
	 T getChave(); 
}
