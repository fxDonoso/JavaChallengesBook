package cl.fxd.java.challenges.ch02math;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Ex05PrimeNumberPairs {
    Ex04PrimeNumber ex04PrimeNumber = new Ex04PrimeNumber();

    Map<Integer,Integer> getParesPrimos(int numeroHAsta){
        List<Integer> listaPrimos = ex04PrimeNumber.calcPrimesUpTo(numeroHAsta +6);
        Map<Integer,Integer> mapaPrimosTwin = new TreeMap<>();
        Map<Integer,Integer> mapaPrimosCousin = new TreeMap<>();
        Map<Integer,Integer> mapaPrimosSexy = new TreeMap<>();

        int primerPrimo, segundoPrimo =0;
        for(int i = 0; i < listaPrimos.size(); i++){
            primerPrimo = listaPrimos.get(i);

            if (listaPrimos.contains(primerPrimo + 2)){
                mapaPrimosTwin.put(primerPrimo, primerPrimo + 2 );
            }
            if (listaPrimos.contains(primerPrimo + 4)){
                mapaPrimosCousin.put(primerPrimo, primerPrimo + 4 );
            }
            if (listaPrimos.contains(primerPrimo + 6)){
                mapaPrimosSexy.put(primerPrimo, primerPrimo + 6 );
            }
        }

        listaPrimos.stream().forEach(System.out::println);
        Stream.of(mapaPrimosTwin).forEach(System.out::println);
        Stream.of(mapaPrimosCousin).forEach(System.out::println);
        Stream.of(mapaPrimosSexy).forEach(System.out::println);

        return mapaPrimosTwin;
    }
}
