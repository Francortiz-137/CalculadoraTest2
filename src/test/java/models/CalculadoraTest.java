package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadora;
    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }
    @Test
    void sumar() {
        int resultado = calculadora.sumar(5, 6);
        assertEquals(11, resultado);
    }

    @Test
    void restar() {
        int resultado = calculadora.restar(5, 6);
        assertEquals(-1, resultado);
    }

    @Test
    void multiplicar() {
        int resultado = calculadora.multiplicar(5, 6);
        assertEquals(30, resultado);
    }

    @Test
    void dividir() {
        float resultado = calculadora.dividir(10, 2);
        assertEquals(5, resultado);

        ArithmeticException exception = assertThrows(ArithmeticException.class, () ->
                calculadora.dividir(10, 0));
        assertEquals("Division por cero", exception.getMessage());
    }
}