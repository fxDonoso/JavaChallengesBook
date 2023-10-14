package cl.fxd.java.challenges.ch02math;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Ex06ChecksumTest {
    Ex06Checksum ex06Checksum = new Ex06Checksum();

    @ParameterizedTest
    @CsvSource({ "11111, 5", "87654321, 0"})
    void calcChecksum(String numero, int checksum) {
        int resultado = ex06Checksum.calcChecksum(numero);
        //int esperado = checksum;

        assertEquals(checksum, resultado);

    }
}