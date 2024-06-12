package models;

public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
    public int restar(int a, int b)
    {
        return a - b;
    }
    public int multiplicar(int a, int b) {

        return a * b;
    }
    public float dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division por cero");
        }
        return (float)a / b;
    }
}
