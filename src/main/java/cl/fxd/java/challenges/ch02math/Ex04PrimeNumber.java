package cl.fxd.java.challenges.ch02math;

import java.util.ArrayList;
import java.util.List;

public class Ex04PrimeNumber {
    List<Integer> calcPrimesUpTo(int numeroHasta){
        List<Integer> primos = new ArrayList<>();

        for(int i = 1; i<= numeroHasta; i++){
            if(isPrime(i)){
                primos.add(i);
            }
        }

        return primos;
    }

    private boolean isPrime(int potencialPrimo) {
        boolean resultado = false;

        if (potencialPrimo==2){
            return true;
        }else{
            for (int i = 2; i <= potencialPrimo/2 + 1; i++){
                boolean divisiblePorI = potencialPrimo % i == 0;
                if (divisiblePorI){
                    resultado = false;
                    break;
                }
                resultado = true;
            }
        }

        return resultado;
    }


}
