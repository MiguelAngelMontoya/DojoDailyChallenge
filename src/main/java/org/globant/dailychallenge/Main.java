package org.globant.dailychallenge;

import org.globant.dailychallenge.ministack.Escenarios;
import org.globant.dailychallenge.pascaltriangle.PascalTriangle;

public class Main {
    public static void main(String[] args) {
        Escenarios escenarios = new Escenarios();
        escenarios.probarEscenario();

        PascalTriangle pascalTriangle = new PascalTriangle();
        pascalTriangle.generateTriangle(5);
    }
}