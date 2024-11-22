package com.fpenha.higeia.dominio.modelo.edl;

import com.fpenha.higeia.dominio.modelo.DominioException;
import com.fpenha.higeia.dominio.modelo.Leito;
import com.fpenha.higeia.dominio.modelo.Paciente;

public abstract class VetorTADS<T> implements Vetor<T> {

    private final int TAMANHO_MINIMO_DE_ELEMENTOS = 1;

    protected String descricao;
    protected T[] elementos;

    /**
     * referência a quantidade de elementos instanciados.
     */
    protected int quantidade = 0;

    /**
     * Construtor padrão para inicializar com uma identificação (descrição) e a quantidade de elementos que
     * esse conjunto será criado, esse quantitativo é fixo.
     * 
     * @param descricao identificação textual da Conjunto.
     * @param quantidadeDeElementos quantidade de Elementos do conjunto.
     * @throws DominioException Exceção lançada se o quantitativo de elementos mínimo (1)
     *                          não for respeitada.
     */
    protected VetorTADS(String descricao, int quantidadeDeElementos) throws DominioException {

        verificaSeAQuantidadeInformadaEhValida(quantidadeDeElementos);
        
        this.descricao = descricao;
        this.elementos = (T[]) new Object[quantidadeDeElementos];
    }



    @Override
    public void inserir(T elemento) throws DominioException {

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

	private void verificaSeOPacienteEhValido(T elemento) throws DominioException {
		if (elemento == null){
            throw new DominioException("Objeto inválido !!!");
        }
	}
	
	private void verificaSeAQuantidadeInformadaEhValida(int quantidadeDeLeito) throws DominioException {
		if(quantidadeDeLeito < TAMANHO_MINIMO_DE_ELEMENTOS)
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

	
}
