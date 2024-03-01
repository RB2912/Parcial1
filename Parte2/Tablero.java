package org.example.Parte2;
//ejercicio 1

public class Tablero {
    private final int[] casillasEspeciales;

    public Tablero() {
        // Inicializa el tablero con 64 casillas, donde -1 representa una casilla normal.
        this.casillasEspeciales = new int[64];
        for (int i = 0; i < casillasEspeciales.length; i++) {
            casillasEspeciales[i] = -1; // Casilla normal
        }

        // Define las serpientes y las escaleras
        int[] origen = {7, 11, 31, 30, 40, 43, 50, 59};
        int[] destino = {38, 37, 46, 2, 21, 60, 5, 42};
        for (int i = 0; i < origen.length; i++) {
            casillasEspeciales[origen[i] - 1] = destino[i] - 1; // Ajuste para el índice base 0
        }
    }

    public int mover(int posicionActual, int tiro) {
        int nuevaPosicion = posicionActual + tiro;
        // Si la nueva posición es mayor que el final del tablero, el jugador retrocede
        if (nuevaPosicion >= casillasEspeciales.length) {
            nuevaPosicion = casillasEspeciales.length - 1 - (nuevaPosicion - casillasEspeciales.length);
        }
        // Verifica si la nueva posición es una casilla especial
        if (casillasEspeciales[nuevaPosicion] != -1) {
            nuevaPosicion = casillasEspeciales[nuevaPosicion];
        }
        return nuevaPosicion;
    }
}
