package cl.fxd.java.challenges.ch02math;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Ex07RomanNumbersTest {
    Ex07RomanNumbers ex07RomanNumbers = new Ex07RomanNumbers();

    @ParameterizedTest
    @CsvSource({"XVII, 17", "CDXLIV, 444", "MCMLXXI, 1971"})
    void fromRomanNumber(String romano, int numero) {
        int resultado = ex07RomanNumbers.fromRomanNumber(romano);

        assertEquals(numero, resultado);
    }

    @ParameterizedTest
    @CsvSource({"14, XIV", "17, XVII", "444, CDXLIV", "1971, MCMLXXI"})
    void toRomanNumber(int numero, String romano) {
        String resultado = ex07RomanNumbers.toRomanNumber(numero);

        assertEquals(romano, resultado);
    }
}