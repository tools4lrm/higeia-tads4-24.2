package com.fpenha.higeia.dominio.modelo;

public class Ala {

    private final int TAMANHO_MINIMO_DE_LEITO = 1;


    private String nome;
    private Leito[] leitos;
    private int indiceDeEntrada = 0;

    public Ala(String nome, int quantidadeDeLeito) throws DominioException {

        this.nome = nome;

        if(quantidadeDeLeito < TAMANHO_MINIMO_DE_LEITO)
            throw new DominioException("Tamanho insuficiente para criação de uma Ala");

        this.leitos = new Leito[quantidadeDeLeito];
    }

    public void adicionarPaciente (Paciente paciente) throws DominioException{

        if(alaLotada()){
            throw new DominioException("Ala Lotada: " + nome);
        }

        Leito leitoOcupado = new Leito(paciente);
        leitos[indiceDeEntrada] = leitoOcupado;

    }

    public void removerPaciente(Paciente paciente){
        
    }

    private boolean alaLotada () {
        return leitos.length-1 < indiceDeEntrada;
    }
}
