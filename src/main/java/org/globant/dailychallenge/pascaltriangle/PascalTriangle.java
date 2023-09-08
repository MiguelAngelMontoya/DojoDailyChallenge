package org.globant.dailychallenge.pascaltriangle;

import java.util.ArrayList;
import java.util.Collection;

public class PascalTriangle {
    public void generateTriangle(int rows){
        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            int coeficiente = 1;
            String row = "";

            for (int j = 0; j <= i; j++) {
                row = row + coeficiente + " ";
                coeficiente = coeficiente * (i - j) / (j + 1);
            }
            lista.add(row);
        }
        print(lista);
    }

    public void print(ArrayList<String> list){
        for(int i=0; i<list.size(); i++){
            for(int j=0; j< (list.get(list.size()-1).length()/2)-i; j++){
                System.out.print(" ");
            }
            System.out.print(list.get(i));
            System.out.println("");
        }
    }
}
