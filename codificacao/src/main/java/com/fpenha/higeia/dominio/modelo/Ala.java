package com.fpenha.higeia.dominio.modelo;

import com.fpenha.higeia.dominio.modelo.edl.Vetor;

/**
 * Classe que repreesnta um ambiente especializado para o tratamento e controle de pacientes 
 * acometido por doenças com gravidade e necessidades similares. Possibilitando assim que o 
 * corpo técnico e recursos tecnológicos possam ser aproveitado na sua plenitude.
 * 
 */
public class Ala implements Vetor<Paciente>{

    /*
     * Uma Ala tem que ter no mínimo um (1) leito
     */
    private final int TAMANHO_MINIMO_DE_LEITO = 1;

    private String nome;
    private Leito[] leitos;

    /**
     * referência do Leito que receberá o paciente corrente (do momento).
     */
    private int indiceDeEntrada = 0;

    /**
     * Instancia a Ala com uma identificação (nome) e a quantidade de leitos que
     * Ala será criada, esse quantitativo é fixo.
     * 
     * @param nome identificação textual da Ala.
     * @param quantidadeDeLeito quantitativo de Leito da Ala.
     * @throws DominioException Exceção lançada se o quantitativo de leito mínimo (1)
     *                          não for respeitada.
     */
    public Ala(String nome, int quantidadeDeLeito) throws DominioException {

        this.nome = nome;

        if(quantidadeDeLeito < TAMANHO_MINIMO_DE_LEITO)
            throw new DominioException("Tamanho insuficiente para criação de uma Ala");

        this.leitos = new Leito[quantidadeDeLeito];
    }

    @Override
    public void inserir(Paciente elemento) throws DominioException {

        if(alaLotada())
            throw new DominioException("Ala Lotada: " + nome);
        
        Leito leitoOcupado = new Leito(elemento);
        leitos[indiceDeEntrada++] = leitoOcupado;

    }

    @Override
    public Paciente remover() throws DominioException {
        
        if(alaVazia())
            throw new DominioException("Ala Vazia: " + nome);

        Leito leito =  leitos[--indiceDeEntrada];
        Paciente paciente = leito.getPaciente();
        
        return paciente;       
    }

    /**
     * Este método remove o Paciente do último Leito ocupado na Ala.
     * 
     * @param paciente uma instancia de Paciente que desocupará o Leito no qual 
     *                  está associado.
     * @throws DominioException Exceção lançada se a Ala estiver vazia ou
     *                          o paciente não esteja na Ala.
     */
    public void removerPaciente(Paciente paciente) throws DominioException{
        
        if(alaVazia())
            throw new DominioException("Ala Vazia: " + nome);       
    }

    private boolean alaLotada () {
        return leitos.length-1 < indiceDeEntrada;
    }

    private boolean alaVazia () {
        return leitos[0] == null;
    }


}
