package cl.fxd.java.challenges.ch02math;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Ex02NumberAsTextTest {

    @ParameterizedTest
    @CsvSource({ "1, uno", "13, uno tres", "7, siete", "24680, dos cuatro seis ocho cero" })
    void numberAsText(int n, String texto) {
        Ex02NumberAsText ex02NumberAsText = new Ex02NumberAsText();
        String result = ex02NumberAsText.numberAsText(n);
        assertEquals(texto, result);
    }
}