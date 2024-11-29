package com.fpenha.higeia.dominio.modelo;

import com.fpenha.higeia.dominio.modelo.edl.Dado;

public class Leito implements Dado<String> {
    private Paciente paciente;
    private String descricao;

    public Leito(String descricao, Paciente paciente){
        this.descricao = descricao;
        this.paciente = paciente;
    }

    public Paciente getPaciente() {
        return paciente;
    }

	@Override
	public String getChave() {
		return paciente.getCPF();
	}

	@Override
	public String getDescricao() {
		return descricao;
	}
    
    
}
