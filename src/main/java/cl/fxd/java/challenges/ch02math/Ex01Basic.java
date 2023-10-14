package cl.fxd.java.challenges.ch02math;

import java.util.List;

public class Ex01Basic {

    int calc(int a, int b){
        int producto = a*b;
        int division = producto/2;
        return division % 7;
    }

    List<String> calcSumAndCountAllNumbersDivBy_2_Or_7(int a){
        int suma = 0;
        int conteo = 0;
        for (int i=1; i<a; i++){
            if (i%2==0 || i%7==0){
                System.out.println("i: " + i);
                suma += i;
                conteo++;
            }
        }
        System.out.println("count: " + conteo);
        System.out.println("suma: " + suma);


        return List.of ("count: " + conteo, "suma: " + suma);
    }

    boolean isEven(int a){
        return a % 2 == 0;
    }

    boolean isOdd(int a){
        return a % 2 !=0;
    }

}
