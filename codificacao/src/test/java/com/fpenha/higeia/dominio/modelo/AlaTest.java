package com.fpenha.higeia.dominio.modelo;

import org.junit.jupiter.api.Test;

public class AlaTest {

    
    @Test
    void criandoUmaAlaComZeroLeitos(){
        criandoUmaAlaComQuantidadeMinimaInvalida(0);
    }
    
    @Test
    void criandoUmaAlaComQuantidadeDeLeitosNegativo(){
        criandoUmaAlaComQuantidadeMinimaInvalida(-1);
    }

    @Test
    void adicionarPacienteEmAlaLotada() throws DominioException{

//        Ala ala = new Ala(null, 1);
//        ala.inserir(new Paciente(null, null));
//
//        Exception excecaoLancada = assertThrows(DominioException.class,
//                                () -> ala.inserir(new Paciente(null, null)),
//                                "Esperado que lance uma exeção de Ala Lotada" );
//                            
//        assertTrue(excecaoLancada.getMessage().contains("Ala Lotada: "));
        
    }

    @Test
    void removerPacienteEmAlaVazia() throws DominioException {

//        Ala ala = new Ala("covid", 1);
//        Paciente paciente = new Paciente("Fábio", "123", 1);
//        
//        Exception excecaoLancada = assertThrows(DominioException.class,
//                                () -> ala.remover(paciente),
//                                "Esperado que lance uma exeção de Ala Vazia" );
//                            
//        assertTrue(excecaoLancada.getMessage().contains("Ala Vazia: "));
        
    }

    @Test
    void removerPacienteDeAlaLotada() throws DominioException {

//        Ala ala = new Ala(null, 1);
//        ala.inserir(new Paciente("fabio", "123"));
//
//        assertThrows(DominioException.class,
//               () -> ala.inserir(new Paciente(null, null)),
//               "Esperado que lance uma exeção de Ala Lotada" );

    }

    private void criandoUmaAlaComQuantidadeMinimaInvalida(int quantidadeDeLeito){

//        Exception excecaoLancada = assertThrows(DominioException.class, 
//                            () -> new Ala("covid", quantidadeDeLeito),
//                            "Esperado que lance uma exceção por tentar criar uma ala com zero leitos") ;
//
//        assertTrue(excecaoLancada.getMessage().contains("Tamanho insuficiente para criação de uma Ala"));
    }
    
}
