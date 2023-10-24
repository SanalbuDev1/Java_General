package com.javatdd.calculadora;

public interface ICalculadora {
    public int sumar(int a, int b);

    public int restar(int a, int b);

    public int multiplicar(int a, int b);

    public int dividir(int a, int b) throws ArithmeticException;
}