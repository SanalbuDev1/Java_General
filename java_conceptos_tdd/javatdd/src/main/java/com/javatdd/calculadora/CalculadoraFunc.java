
package com.javatdd.calculadora;

import java.util.function.BiFunction;

public class CalculadoraFunc {
    /*
     * public static void main(String[] args) {
     * Double opeSuma = operacion((a, b) -> a + b, 2, 3);
     * Double opeResta = operacion((a, b) -> a - b, 2, 3);
     * Double opeMult = operacion((a, b) -> a * b, 2, 3);
     * Double opeDiv = operacion(CalculadoraFunc::division, 2.0, 3.0);
     * System.out.println("opeSuma: " + opeSuma);
     * System.out.println("opeResta: " + opeResta);
     * System.out.println("opeMult: " + opeMult);
     * System.out.println("opeDiv: " + opeDiv);
     * }
     */

    public static double operacion(BiFunction<Double, Double, Double> operacion, double a, double b) {
        return operacion.apply(a, b);
    }

    public static double division(Double a, Double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }

    public static double multiplicar(Double a, Double b) {
        return a * b;
    }

}