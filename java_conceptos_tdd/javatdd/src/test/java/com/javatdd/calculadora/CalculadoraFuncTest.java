package com.javatdd.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraFuncTest {

    CalculadoraFunc calculadoraFunc;

    @BeforeEach
    public void setUp() {
        // Arrange
        calculadoraFunc = new CalculadoraFunc();
    }

    @Test
    public void operacionSumar() {
        // Act
        double val1 = 3, val2 = 5;
        double resultado = CalculadoraFunc.operacion((a, b) -> a + b, val1, val2);
        // Assert
        Assertions.assertEquals(resultado, 8);
    }

    @Test
    public void operacionRestar() {
        // Act
        double val1 = 3, val2 = 5;
        double resultado = CalculadoraFunc.operacion((a, b) -> a - b, val1, val2);
        // Assert
        Assertions.assertEquals(resultado, -2);
    }

    @Test
    public void operacionMultiplicar() {
        // Act
        double val1 = 3, val2 = 5;
        double resultado = CalculadoraFunc.operacion(CalculadoraFunc::multiplicar, val1, val2);
        // Assert
        Assertions.assertEquals(resultado, 15);
    }

    @Test
    public void operacionDividir() {
        // Act
        double val1 = 10, val2 = 5;
        double resultado = CalculadoraFunc.operacion(CalculadoraFunc::division, val1, val2);
        // Assert
        Assertions.assertEquals(resultado, 2);
    }

    @Test
    public void operacionDividirPorCero() {
        // Act
        double val1 = 10, val2 = 0;
        Assertions.assertThrows(ArithmeticException.class, () -> {
            CalculadoraFunc.operacion(CalculadoraFunc::division, val1, val2);
        });
    }

}
