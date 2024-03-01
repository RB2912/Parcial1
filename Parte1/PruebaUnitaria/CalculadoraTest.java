package org.example.Parte1.PruebaUnitaria;
import org.example.Parte1.PruebaUnitaria.Calculadora;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(5, 3);
        Assert.assertEquals(8, resultado); // Verifica que 5 + 3 sea igual a 8
    }

    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.restar(5, 3);
        Assert.assertEquals(2, resultado); // Verifica que 5 - 3 sea igual a 2
    }
}

