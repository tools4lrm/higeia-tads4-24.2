package com.fpenha.higeia.dominio.modelo;

public class Paciente {

    private String nome;
    private String CPF;
    private int numeracaoDeLeito;
    
    public Atendimento atendimento = null;

    public Paciente(String nome, String CPF, Atendimento atendimento){
        this.nome = nome;
        this.CPF = CPF;
        this.atendimento = atendimento;
    }

    public Paciente  (String nome, String CPF, int numeracaoDeLeito, Atendimento atendimento) {
    	this(nome, CPF, atendimento);
    	
    	this.numeracaoDeLeito = numeracaoDeLeito;
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
