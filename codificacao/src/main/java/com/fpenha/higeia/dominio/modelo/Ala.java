package com.fpenha.higeia.dominio.modelo;

import com.fpenha.higeia.dominio.modelo.edl.Dado;
import com.fpenha.higeia.dominio.modelo.edl.VetorTADS;

/**
 * Classe que repreesnta um ambiente especializado para o tratamento e controle de pacientes 
 * acometido por doenças com gravidade e necessidades similares. Possibilitando assim que o 
 * corpo técnico e recursos tecnológicos possam ser aproveitado na sua plenitude.
 * 
 */
public class Ala extends  VetorTADS<Leito, String> implements Dado<String> {

	private String descricao;
	
	public Ala (String descricao, int quantidadeDeElementos) throws DominioException {
		super (Leito.class, quantidadeDeElementos);
		
		this.descricao = descricao;
	}

	@Override
	public String getChave() {
		return this.descricao;
	}
	
	@Override
	public String getDescricao() {
		return this.descricao;
	} 
	
    public String toString() {
    	Leito[] leitos = array();
    	StringBuilder sb = new StringBuilder("Disponibilidade de Leitos na Ala : \n");
        
    	for (int i = 0; i < leitos.length; i++) {
        	
        	Leito leito = leitos[i];
        	String texto = ( leito != null) ? leito.getDescricao() : "Sem Ocupação" ;  
            sb.append("[ "+i+" ] - " + texto +"\n" );
            
            
        }
        sb.append("\n");
        return sb.toString();
    }

	
	
}
