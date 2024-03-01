package org.example.Parte2.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class MatrizAdyacente {

    /**
     * Encuentra las posiciones adyacentes a una posición dada en una matriz.
     * Las posiciones adyacentes se definen como aquellas que comparten un lado con la posición dada.
     *
     * @param matriz La matriz de números enteros.
     * @param fila   La fila de la posición dada.
     * @param columna La columna de la posición dada.
     * @return Una lista de posiciones adyacentes en formato (fila, columna).
     */
    public List<int[]> encontrarPosicionesAdyacentes(int[][] matriz, int fila, int columna) {
        List<int[]> posicionesAdyacentes = new ArrayList<>();

        // Arriba
        if (fila > 0) {
            posicionesAdyacentes.add(new int[]{fila - 1, columna});
        }

        // Abajo
        if (fila < matriz.length - 1) {
            posicionesAdyacentes.add(new int[]{fila + 1, columna});
        }

        // Izquierda
        if (columna > 0) {
            posicionesAdyacentes.add(new int[]{fila, columna - 1});
        }

        // Derecha
        if (columna < matriz[0].length - 1) {
            posicionesAdyacentes.add(new int[]{fila, columna + 1});
        }

        return posicionesAdyacentes;
    }

    public static void main(String[] args) {
        MatrizAdyacente ma = new MatrizAdyacente();
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<int[]> adyacentes = ma.encontrarPosicionesAdyacentes(matriz, 1, 1);
        for (int[] pos : adyacentes) {
            System.out.println("Posición adyacente: (" + pos[0] + "," + pos[1] + ")");
        }
    }
}

