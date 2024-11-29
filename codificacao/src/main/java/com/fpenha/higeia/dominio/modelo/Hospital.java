package com.fpenha.higeia.dominio.modelo;

import com.fpenha.higeia.dominio.modelo.edl.VetorTADS;

public class Hospital extends VetorTADS<Ala, String> {

	private static Hospital instancia = null;
	
	private Hospital(String descricao, int quantidadeDeElementos) throws DominioException {
		super(Ala.class, quantidadeDeElementos);
	}  
	
	public static Hospital getInstancia() {
		return instancia;
	}
	
	public static Hospital configurarHospitalParaSessao(String descricao, int quantidadeDeElementos)  throws DominioException {
		if(instancia == null) {
			instancia = new Hospital(descricao, quantidadeDeElementos);
		}
		
		return instancia;
	}

    public String toString() {
        Ala[] alas = array();
    	StringBuilder sb = new StringBuilder("Alas Registradas para o Hospital : \n");
        
    	for (int i = 0; i < alas.length; i++) {
        	
        	Ala ala = alas[i];
        	String texto = ( ala != null) ? ala.getDescricao() : "Sem Definição" ;  
            sb.append("[ "+i+" ] - " + texto +"\n" );
            
            
        }
        sb.append("\n");
        return sb.toString();
    }
}
