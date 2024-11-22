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
     * referência a quantidade de leito ocupados no momento.
     */
    private int quantidade = 0;

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

        verificaSeAQuantidadeInformadaEhValida(quantidadeDeLeito);
        
        this.nome = nome;
        this.leitos = new Leito[quantidadeDeLeito];
    }



    @Override
    public void inserir(Paciente elemento) throws DominioException {

        verificaSeExisteLeitoDisponivel();
        verificaSeOPacienteEhValido(elemento);
        verificaSeExistePacienteNoLeitoInformado(elemento.getNumeracaoDeLeito());
        
        Leito leitoOcupado = new Leito(elemento);
        leitos[elemento.getNumeracaoDeLeito()] = leitoOcupado;
        ++quantidade;

    }


    @Override
    public void remover(Paciente elemento) throws DominioException {
        

        verificaSeAlaEstaVazia();
        verificaSeOPacienteEhValido(elemento);
        verificaSeExistePacienteNoLeitoInformado(elemento.getNumeracaoDeLeito());
        verificaSeOPacienteEhOMesmoDoLeito(elemento);
        
        leitos[elemento.getNumeracaoDeLeito()] = null;
        --quantidade;
              
    }
    
	@Override
	public void buscar(Paciente elemento) throws DominioException {
	
		verificaSeAlaEstaVazia();        
        verificaSeOPacienteEhValido(elemento);
        
        
		
	}

	@Override
	public Paciente[] array() {
		return null;
	}
    

	private void verificaSeOPacienteEhOMesmoDoLeito(Paciente elemento) throws DominioException {
		Paciente pacienteNoLeito = leitos[elemento.getNumeracaoDeLeito()].getPaciente();
        if(!pacienteNoLeito.getNome().equals(elemento.getNome())) {
        	throw new DominioException("Paciente alocado no Leito não é o mesmo !!!");
        }
	}

	private void verificaSeExistePacienteNoLeitoInformado(int numeracaoDeLeito) throws DominioException {
		if(leitos[numeracaoDeLeito] == null ) {
        	throw new DominioException("Não existe Paciente não no Leito !!!");
        }
	}

	private void verificaSeOPacienteEhValido(Paciente elemento) throws DominioException {
		if (elemento == null){
            throw new DominioException("Objeto inválido !!!");
        }
	}
	
	private void verificaSeAQuantidadeInformadaEhValida(int quantidadeDeLeito) throws DominioException {
		if(quantidadeDeLeito < TAMANHO_MINIMO_DE_LEITO)
            throw new DominioException("Tamanho insuficiente para criação de uma Ala");
	}
	
	private void verificaSeExisteLeitoDisponivel() throws DominioException {
		if(alaLotada())
            throw new DominioException("Ala Lotada: " + nome);
	}

	private void verificaSeAlaEstaVazia() throws DominioException {
		if(alaVazia()) {
            throw new DominioException("Ala Vazia: " + nome);
        }
	}


    private boolean alaLotada () {
        return quantidade >= leitos.length  ;
    }

    private boolean alaVazia () {
        return quantidade <= 0;
    }




}
