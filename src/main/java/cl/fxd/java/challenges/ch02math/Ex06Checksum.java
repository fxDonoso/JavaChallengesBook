package cl.fxd.java.challenges.ch02math;

import java.util.stream.Stream;

public class Ex06Checksum {

    int calcChecksum(String numero){
        int largoNumero     = numero.length();
        int sumaDeProductos = 0;
        int digito          = 0;

        for(int i = 0; i < largoNumero; i++){
            digito          = Integer.parseInt(numero.substring(i,i+1));
            sumaDeProductos += digito * (i + 1);
        }

        int checkSum = sumaDeProductos%10;

        return checkSum;
    }
}
