package com.fpenha.higeia.dominio.modelo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

  

    private void criandoUmaAlaComQuantidadeMinimaInvalida(int quantidadeDeLeito){

        Exception excecaoLancada = assertThrows(DominioException.class, 
                            () -> new Ala("covid", quantidadeDeLeito),
                            "Esperado que lance uma exceção por tentar criar uma ala com zero leitos") ;

        assertTrue(excecaoLancada.getMessage().contains("Tamanho insuficiente para criação de uma Ala"));
    }
    
}
