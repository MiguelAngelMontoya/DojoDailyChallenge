package org.globant.dailychallenge.ministack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EscenariosTest {
    private Escenarios escenarios;

    @BeforeEach
    void setUp(){
        escenarios = new Escenarios();
    }

    @Test
    public void testingExecutionProject(){
        Assertions.assertNotNull(escenarios.probarEscenario());
    }
}