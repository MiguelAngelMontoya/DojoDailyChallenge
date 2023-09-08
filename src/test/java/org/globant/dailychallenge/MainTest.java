package org.globant.dailychallenge;

import org.globant.dailychallenge.ministack.Escenarios;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {
    private Escenarios escenarios;
    @BeforeEach
    void setUp() {
        escenarios = new Escenarios();
    }
    @Test
    public void testMainClass(){
        escenarios = new Escenarios();
        Assertions.assertNotNull(escenarios);
    }
}