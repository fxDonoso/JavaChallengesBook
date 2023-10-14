package cl.fxd.java.challenges.ch02math;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ex04PrimeNumberTest {
    Ex04PrimeNumber ex04PrimeNumber = new Ex04PrimeNumber();

    @Test
    void calcPrimesUpTo5() {
        List<Integer> resultado = ex04PrimeNumber.calcPrimesUpTo(5);
        List<Integer> esperado = List.of(2,3,5);

        assertEquals(esperado,resultado);
    }

    @Test
    void calcPrimesUpTo25() {
        List<Integer> resultado = ex04PrimeNumber.calcPrimesUpTo(25);
        List<Integer> esperado = List.of(2,3,5, 7, 11, 13, 17, 19, 23);
        assertEquals(esperado,resultado);
    }
    @Test
    void calcPrimesUpTo50() {
        List<Integer> resultado = ex04PrimeNumber.calcPrimesUpTo(50);
        List<Integer> esperado = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47);
        assertEquals(esperado,resultado);
    }
}