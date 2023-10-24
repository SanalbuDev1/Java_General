package com.javatdd.notas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NotasTest {

    Notas notas;

    @BeforeEach
    public void setUp() {
        // Arrange
        notas = new Notas(3.5, "Matemáticas");
    }

    @Test
    public void esMismaAsignatura() {
        // ACT
        Notas notas = new Notas(4, "Matemáticas");
        this.notas.esMismaAsignatura(notas);
        // Assert
        Assertions.assertEquals(this.notas.getAsignatura(), notas.getAsignatura());
    }

    @Test
    public void NoEsMismaAsignaturaFunc() {
        // ACT
        Notas notas = new Notas(4, "Matemáticas 3");
        Notas.esMismaAsignaturaFunc((a) -> a.equals(notas.getAsignatura()), this.notas);
        // Assert
        Assertions.assertFalse(() -> this.notas.getAsignatura().equals(notas.getAsignatura()), "no es el mismo");
    }

    @Test
    public void CompararNotasSonIguales() {

        // ACT
        Notas notas = new Notas(4, "Matemáticas 3");
        Notas notas2 = new Notas(4, "Matemáticas 3");
        boolean esIgual = notas.equals(notas2);

        // Assert
        Assertions.assertTrue(esIgual, "son iguales");

    }

}
