package cl.fxd.java.challenges.ch02math;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ex01BasicTest {
    Ex01Basic ex01Basic = new Ex01Basic();

    //@Test
    @ParameterizedTest
    @CsvSource({ "6, 7, 0", "3, 4, 6", "5, 5, 5" })
    void calc(int m, int n, int expected) {
        int result = ex01Basic.calc(m, n);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({ "3, 1, 2", "8, 4, 19", "15, 8, 63" })
    void calcSumAndCountAllNumbersDivBy_2_Or_7(int numero, int count, int suma){
        List<String> esperado = List.of ("count: " + count, "suma: " + suma);
        List<String> resultado = ex01Basic.calcSumAndCountAllNumbersDivBy_2_Or_7(numero);

        assertLinesMatch(esperado,resultado);

    }

    @ParameterizedTest
    @ValueSource(ints = {2,4,8,10})
    void sonPares(int numero){
        boolean result = ex01Basic.isEven(numero);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {3,5,7,11})
    void sonImpares(int numero){
        boolean result = ex01Basic.isOdd(numero);
        assertTrue(result);
    }

}