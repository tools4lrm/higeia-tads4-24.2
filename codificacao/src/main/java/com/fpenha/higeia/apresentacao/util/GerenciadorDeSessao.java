package com.fpenha.higeia.apresentacao.util;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeSessao {
	
	public static String ALA_ARMAZENADA = "CHAVE_ALA"; 
	
    private static GerenciadorDeSessao instancia;
    private Map<String, Object> dadosDaSessao;

    private GerenciadorDeSessao () {
    	dadosDaSessao = new HashMap<>();
    }

    public static synchronized GerenciadorDeSessao getInstance() {
        if (instancia == null) {
        	instancia = new GerenciadorDeSessao();
        }
        return instancia;
    }

    public void configuraDadoParaSessao(String chave, Object valor) {
    	dadosDaSessao.put(chave, valor);
    }

    public Object recuperaDadoDaSessao(String chave) {
        return dadosDaSessao.get(chave);
    }

    public void removeAttribute(String chave) {
    	dadosDaSessao.remove(chave);
    }

    public void limpaSessao() {
    	dadosDaSessao.clear();
    }
}
