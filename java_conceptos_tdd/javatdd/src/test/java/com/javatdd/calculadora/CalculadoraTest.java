package com.javatdd.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        // Arrange

        calculadora = new Calculadora();
    }

    @Test
    public void sumar() {

        // Act
        int val1 = 3, val2 = 5;
        int resultado = calculadora.sumar(val1, val2);
        // Assert
        Assertions.assertEquals(resultado, 8);

    }

    @Test
    public void restar() {

        // Act
        int val1 = 3, val2 = 5;
        int resultado = calculadora.restar(val1, val2);
        // Assert
        Assertions.assertEquals(resultado, -2);

    }

    @Test
    public void multiplicar() {

        // Act
        int val1 = 3, val2 = 5;
        int resultado = calculadora.multiplicar(val1, val2);
        // Assert
        Assertions.assertEquals(resultado, 15);

    }

    @Test
    public void dividir() {

        // Act
        int val1 = 10, val2 = 5;
        int resultado = calculadora.dividir(val1, val2);
        // Assert
        Assertions.assertEquals(resultado, 2);

    }

    @Test
    public void dividirPorCero() {

        // Act
        int val1 = 10, val2 = 0;
        // Assert
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(val1, val2);
        });

    }

}
