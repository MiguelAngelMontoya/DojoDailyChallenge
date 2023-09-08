package org.globant.dailychallenge.pascaltriangle;

public class PascalTriangle {
    public void generateTriangle(int rows){
        for (int i = 0; i < rows; i++) {
            int coeficiente = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(coeficiente + " ");
                coeficiente = coeficiente * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
