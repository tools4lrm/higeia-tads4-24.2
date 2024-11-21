package com.fpenha.higeia.dominio.modelo;

public class Paciente {

    private String nome;
    private String CPF;
    private int numeracaoDeLeito;

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

	public int getNumeracaoDeLeito() {
		return numeracaoDeLeito;
	}

	public void setNumeracaoDeLeito(int numeracaoDeLeito) {
		this.numeracaoDeLeito = numeracaoDeLeito;
	}
      
    
}
