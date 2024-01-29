package org.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class FibonacciTest {
    @Test
    public void pruebaFibonacci() {
        // Pruebas para los primeros números de Fibonacci.
        assertEquals(0, Fibonacci.calcular(0));
        assertEquals(1, Fibonacci.calcular(1));
        assertEquals(1, Fibonacci.calcular(2));
        assertEquals(2, Fibonacci.calcular(3));
        assertEquals(3, Fibonacci.calcular(4));
        assertEquals(5, Fibonacci.calcular(5));
        // Agregar más pruebas según sea necesario
    }
}
