package com.fpenha.higeia.dominio.modelo;

import com.fpenha.higeia.dominio.modelo.edl.ListaSingularmenteEncadeada;

public class Triagem implements ListaSingularmenteEncadeada <Paciente>{

    @Override
    public Paciente remover() throws DominioException {
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    @Override
    public void inserir(Paciente elemento) {
        throw new UnsupportedOperationException("Unimplemented method 'inserir'");
    }

    @Override
    public int tamanho() {
        throw new UnsupportedOperationException("Unimplemented method 'tamanho'");
    }

    @Override
    public Paciente primeiroElemento() throws DominioException {
        throw new UnsupportedOperationException("Unimplemented method 'primeiroElemento'");
    }

    @Override
    public Paciente ultimoElemento() throws DominioException {
        throw new UnsupportedOperationException("Unimplemented method 'ultimoElemento'");
    }



}
