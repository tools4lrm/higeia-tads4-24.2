package com.fpenha.higeia.dominio.modelo.edl;

import java.lang.reflect.Array;

import com.fpenha.higeia.dominio.modelo.DominioException;

public abstract class VetorTADS<E extends Dado, K> implements Vetor<E, K> {

    private final int TAMANHO_MINIMO_DE_ELEMENTOS = 1;

   protected E[] elementos;

    /**
     * referência a quantidade de elementos instanciados.
     */
    protected int quantidade = 0;

    /**
     * Construtor padrão para inicializar com uma identificação (descrição) e a quantidade de elementos que
     * esse conjunto será criado, esse quantitativo é fixo.
     * 
     * @param descricao identificação textual da Conjunto.
     * @param quantidadeDeElementos quantidade de Elementos do conjunto.
     * @throws DominioException Exceção lançada se o quantitativo de elementos mínimo (1)
     *                          não for respeitada.
     */
    protected VetorTADS(Class cls, int quantidadeDeElementos) throws DominioException {

        verificaSeAQuantidadeInformadaEhValida(quantidadeDeElementos);
        
        this.elementos = (E[]) Array.newInstance(cls, quantidadeDeElementos);
    }

    
	@Override
	public E buscar(int posicao) throws DominioException {
	
		estruturaEstahVazia();
		aPosicaoEhValida(posicao);
		haElementoNaPosicao(posicao);
		
		return elementos[posicao];
	}
    
	@Override
    public E buscar (K chave) throws DominioException {
    	
		estruturaEstahVazia();
	
		for (int i = 0; i < elementos.length; i++) {
			
			E elemento = elementos[i];
			if(elemento == null) continue;
			if(elemento.getChave().equals(chave)) { 
				return elemento;
			}
		}
		
		throw new DominioException("Elemento não encontrado na estrutura !!!");
    }
	
	@Override
    public int posicaoNaEstrutura (K chave) throws DominioException {
    	
		estruturaEstahVazia();

		for (int i = 0; i < elementos.length; i++) {
			
			E elemento = elementos[i];
			if(elemento == null) continue;
			if(elemento.getChave().equals(chave)) { 
				return i;
			}
		}
		
		throw new DominioException("Elemento não encontrado na estrutura !!!");
    }

    @Override
    public void inserir(E elemento, int posicao) throws DominioException {

        estruturaEstahCheia();
        oElementoEhValido(elemento);
        naoHaElementoNaPosicao(posicao);
        
        elementos[posicao] = elemento;
        ++quantidade;

    }

    @Override
    public E remover(int posicao) throws DominioException {
    
    	E elementoASerRemovido = buscar(posicao);
    	elementos[posicao] = null;
    	--quantidade;
    	
    	return elementoASerRemovido;
    }

    @Override
	public E[] array() {
		return elementos.clone();
	}

	private void aPosicaoEhValida(int posicao) throws DominioException {
		if( posicao < 0 || posicao > (elementos.length-1) ) {
        	throw new DominioException("Posição informada é inválida !!!");
        }		
	}
	
	private void naoHaElementoNaPosicao(int posicao) throws DominioException {
		if(elementos[posicao] != null ) {
        	throw new DominioException("Existe Elemento na posição informada !!!");
        }
	}
	
	private void haElementoNaPosicao(int posicao) throws DominioException {
		if(elementos[posicao] == null ) {
        	throw new DominioException("Não existe Elemento na posição informada !!!");
        }
	}

	private void oElementoEhValido(E elemento) throws DominioException {
		if (elemento == null || elemento.getChave() == null){
            throw new DominioException("Objeto inválido !!!");
        }
	}
	
	private void verificaSeAQuantidadeInformadaEhValida(int quantidadeDeLeito) throws DominioException {
		if(quantidadeDeLeito < TAMANHO_MINIMO_DE_ELEMENTOS)
            throw new DominioException("Tamanho insuficiente para criação de uma Ala");
	}
	
	private void estruturaEstahCheia() throws DominioException {
		if(quantidade >= elementos.length)
            throw new DominioException("A estrutura está cheia !!!! ");
	}
	
	private void estruturaEstahVazia() throws DominioException {
		if (quantidade == 0) {
			throw new DominioException("Estrutura vazia ");
		}
	}
	
}
