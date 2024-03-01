package org.example.Parte1;

public class EjemploFuerte {
    public static void main(String[] args) {
        int numero = 5;
        String texto = "Hola";
        // String resultado = numero + texto; // Esto producirá un error de compilación en Java
        String resultado = numero + ""; // Conversión explícita a String
        System.out.println(resultado);
    }
}
//Ejemplo en JavaScript (débilmente tipado):
//let numero = 5;
//let texto = "Hola";
//let resultado = numero + texto; // La conversión de 'numero' a string es implícita
//console.log(resultado); // "5Hola"
