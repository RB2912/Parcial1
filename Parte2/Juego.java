package org.example.Parte2;
//ejercicio 1

public class Juego {
    private Jugador jugador;
    private Tablero tablero;

    public Juego() {
        this.jugador = new Jugador();
        this.tablero = new Tablero();
    }

    public void iniciar() {
        while (true) {
            int tiro = jugador.tirarDado();
            System.out.println("Jugador tira el dado y saca: " + tiro);

            if (!jugador.estaBloqueado() || tiro == 6) {
                jugador.mover(tiro, tablero);
                System.out.println("Jugador se mueve a la casilla: " + (jugador.getPosicion() + 1));

                if (jugador.getPosicion() == 63) { // Índice base 0 para la posición 64
                    System.out.println("¡El jugador ha ganado!");
                    break;
                }
            } else {
                System.out.println("Jugador bloqueado, necesita sacar un 6 para desbloquearse");
            }
        }
    }

    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.iniciar();
    }
}
