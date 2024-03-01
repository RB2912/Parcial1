package org.example.Parte2;
import java.util.Random;
//ejercicio 1

public class Jugador {
    private int posicion;
    private int consecutivosSeis;
    private final Random dado;

    public Jugador() {
        this.posicion = 0; // Todos los jugadores comienzan en la casilla de inicio
        this.consecutivosSeis = 0;
        this.dado = new Random();
    }

    public int tirarDado() {
        return dado.nextInt(6) + 1; // Genera un número entre 1 y 6
    }

    public void mover(int tiro, Tablero tablero) {
        if (tiro == 6) {
            consecutivosSeis++;
            if (consecutivosSeis == 3) {
                // Si el jugador saca tres 6 seguidos, vuelve a la posición de inicio y se bloquea
                posicion = 0;
                consecutivosSeis = 0;
                return;
            }
        } else {
            consecutivosSeis = 0;
        }

        posicion = tablero.mover(posicion, tiro);
    }

    public int getPosicion() {
        return posicion;
    }

    public boolean estaBloqueado() {
        return consecutivosSeis == 3;
    }
}

