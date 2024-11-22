package com.fpenha.higeia.apresentacao.util;

import com.fpenha.higeia.dominio.modelo.Ala;
import com.fpenha.higeia.dominio.modelo.DominioException;
import com.fpenha.higeia.dominio.modelo.edl.Vetor;

public class GerenciadorDeAlas implements Vetor<Ala> {
	
    private static GerenciadorDeAlas instancia;
    private Ala[] alas;

    private GerenciadorDeAlas () {
    	alas = new Ala[3];
    }

    public static synchronized GerenciadorDeAlas getInstance() {
        if (instancia == null) {
        	instancia = new GerenciadorDeAlas();
        }
        return instancia;
    }

	@Override
	public void buscar(Ala elemento) throws DominioException {
		
	}

	@Override
	public void inserir(Ala elemento) throws DominioException {
	
	}

	@Override
	public void remover(Ala elemento) throws DominioException {
		
	}

	@Override
	public Ala[] array() {
		return null;
	}

    
    
}
