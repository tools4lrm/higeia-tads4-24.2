package com.fpenha.higeia.dominio.modelo;

public class Paciente {

    private String nome;
    private String CPF;

    public Paciente(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }
    
    
}
