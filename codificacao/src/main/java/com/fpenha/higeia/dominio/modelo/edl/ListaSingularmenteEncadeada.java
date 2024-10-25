package com.fpenha.higeia.dominio.modelo.edl;

import com.fpenha.higeia.dominio.modelo.DominioException;

/**
 * Uma lista encadeada é uma estrutura de dados linear que representa uma sequência de nós, 
 * onde cada elemento da sequência é armazenado em um nó da lista; o primeiro elemento na 
 * primeira célula, o segundo na segunda, e assim por diante. Cada nó (estrutura) contém 
 * dois elementos principais:
 *  
 * Dados: A informação que o nó armazena (por exemplo, o paciente).
 * Ponteiro: Uma referência (ou "ponteiro") que indica o próximo nó na sequência.
 * 
 * Diferente do Vetor, essa estrutura é flexível no tamanho e acesso.
 * 
 */
public interface ListaSingularmenteEncadeada <T> extends Vetor<T> {

    /**
     * Método responsável por adicionar o elemento como sucessor na estrutura.
     * 
     * @param elemento instancia do elemento que será armazenado na estrutura.
     */
    public void inserir(T elemento);

    /**
     * Método que fornecerá o tamanho da estrutura no momento da consulta.
     * 
     * @return um inteiro indicando a quantidade.
     */
    public int tamanho();

    /**
     * Método que retornará o primeiro elemento da lista.
     * 
     * @return o elemento que estiver na primeira posição da lista.
     * @throws DominioException Exceção lançada se a estrutura estiver vazia.
     */
    public T primeiroElemento()throws DominioException;

    /**
     * Método que retornará o último elemento da lista.
     * 
     * @return o elemento que estiver na última posição da lista.
     * @throws DominioException Exceção lançada se a estrutura estiver vazia.
     */
    public T ultimoElemento() throws DominioException;

}
