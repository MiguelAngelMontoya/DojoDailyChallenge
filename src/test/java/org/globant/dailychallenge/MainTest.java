package org.globant.dailychallenge;

import org.globant.dailychallenge.ministack.Escenarios;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void main() {
        Escenarios escenarios = new Escenarios();
        Assertions.assertNotNull(escenarios.probarEscenario());
    }
}