package com.fpenha.higeia.dominio.modelo;

public class Leito {
    private Paciente paciente;

    public Leito(Paciente paciente){
        this.paciente = paciente;
    }

    public Paciente getPaciente() {
        return paciente;
    }
}
