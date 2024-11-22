package com.fpenha.higeia.dominio.modelo.edl;

import com.fpenha.higeia.dominio.modelo.DominioException;

/**
 * Um Vetor (também chamado de array, arranjo ou variável indexada) é uma estrutura de dados linear 
 * que armazena um conjunto de elementos do mesmo tipo em posições consecutivas na memória. Cada 
 * posição no vetor é referenciada por um índice, que permite o acesso direto ao valor armazenado 
 * naquela posição de forma única. 
 * 
 * Principais Características de um Vetor    
 *
 * - Tamanho fixo / Acesso direto / Homogeneidade / Sequencial
 * 
 */
public interface Vetor <T> {

   /**
     * Método que buscará o elemento passado no vetor
     * 
     * @param elemento instancia do elemento que será armazenado na estrutura.
     * @throws DominioException Exceção lançada se a estrutura estiver cheia.
     */
    public void buscar(T elemento) throws DominioException;
	
 
    /**
     *  Método responsável por adicionar o elemento na estrutura.
     * 
     * @param elemento instancia do elemento que será armazenado na estrutura.
     * @throws DominioException Exceção lançada se a estrutura estiver cheia.
     */
    public void inserir(T elemento) throws DominioException;

    /**
     *  Método remove o elemento da última posição ocupada na estrutura.
     * 
     * @throws DominioException Exceção lançada se a estrutura estiver vazia.
     */
    public void remover(T elemento) throws DominioException;
    
    /**
     *  Método que irá retornar os elementos do vetor em um array de acordo com eles estejam posicionados
     * 
     */   
    public T[] array();
}
