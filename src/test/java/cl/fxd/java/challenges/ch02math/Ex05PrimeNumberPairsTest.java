package cl.fxd.java.challenges.ch02math;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Ex05PrimeNumberPairsTest {

    Ex05PrimeNumberPairs ex05PrimeNumberPairs =  new Ex05PrimeNumberPairs();
    @Test
    void getParesPrimos() {
        Map<Integer, Integer> resultado = ex05PrimeNumberPairs.getParesPrimos(50);
    }
}