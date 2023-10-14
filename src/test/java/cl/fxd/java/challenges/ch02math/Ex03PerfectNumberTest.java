package cl.fxd.java.challenges.ch02math;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ex03PerfectNumberTest {
    Ex03PerfectNumber ex03PerfectNumber =  new Ex03PerfectNumber();

    @Test
    void calcPerfectNumbersSeis() {
        List<Integer> result = ex03PerfectNumber.calcPerfectNumbers(6);
        List<Integer> esperado = List.of(6);
        assertEquals(esperado, result);
    }

    @Test
    void calcPerfectNumbersCuarenta() {
        List<Integer> result = ex03PerfectNumber.calcPerfectNumbers(40);
        List<Integer> esperado = List.of(6,28);
        assertEquals(esperado, result);

    }

    @Test
    void calcPerfectNumbersMil() {
        List<Integer> result = ex03PerfectNumber.calcPerfectNumbers(1000);
        List<Integer> esperado = List.of(6,28,496);
        assertEquals(esperado, result);

    }

    @Test
    void calcPerfectNumbersDiezMil() {
        List<Integer> result = ex03PerfectNumber.calcPerfectNumbers(10000);
        List<Integer> esperado = List.of(6,28,496,8128);
        assertEquals(esperado, result);

    }
}