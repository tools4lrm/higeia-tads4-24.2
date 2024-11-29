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
 * @param E
 * @param K
 */
public interface Vetor <E, K> {

   /**
     * Método que recuperará o elemento armazenado na estrutura.
     * 
     * @param posicao inteiro que indica a localizacao do elemento na estrutura.
     * @throws DominioException Exceção lançada se a posição indicada estiver vazia.
     */
    public E buscar(int posicao) throws DominioException;
    
    /**
     * Método que recuperará o elemento armazenado na estrutura.
     * 
     * @param K dado que identifica o elemento de forma única dentro da estrutura.
     * @throws DominioException Exceção lançada se o dado passado não estiver relacionado a nenhum elemento da estrutura. 
     */
    public E buscar(K chave) throws DominioException;
	
    /**
     * Método que recuperará a posição do elemento armazenado na estrutura.
     * 
     * @param K dado que identifica o elemento de forma única dentro da estrutura.
     * @throws DominioException Exceção lançada se o dado passado não estiver relacionado a nenhum elemento da estrutura. 
     */
    public int posicaoNaEstrutura(K chave) throws DominioException;
 
    /**
     *  Método responsável por adicionar o elemento na estrutura.
     * 
     * @param elemento instancia do elemento que será armazenado na estrutura.
     * @param posicao inteiro que indica a posição que elemento será armazenado na estrutura.
     * @throws DominioException Exceção lançada se a estrutura estiver cheia.
     * @throws DominioException Exceção lançada se a posição desejada estiver ocupada.
     */
    public void inserir(E elemento, int posicao) throws DominioException;

    /**
     *  Método remove o elemento da estrutura.
     *  
     * @param posicao inteiro que indica a localizacao do elemento na estrutura. 
     * @throws DominioException Exceção lançada se o elemento não estiver na estrutura.
     * @throws DominioException Exceção lançada se o elemento não estiver na estrutura.
     */
    public E remover(int posicao) throws DominioException;
    
    /**
     *  Método que irá retornar os elementos do vetor em um array de acordo com eles estejam posicionados
     * 
     */   
    public E[] array();
}
