package cl.fxd.java.challenges.ch02math;

import java.util.ArrayList;
import java.util.List;

public class Ex03PerfectNumber {

    List<Integer> calcPerfectNumbers(int n) {
        List<Integer> perfectos = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            //Calcular esPerfectos de cada i
            if (esPerfecto(i)) {
                perfectos.add(i);
            }
        }

        return perfectos;
    }

    private boolean esPerfecto(int n){
        int divisoresSum = 0;
        for(int i = 1; i < n; i++) {
            //calcular divisores de n
            if (n % i == 0) {
                divisoresSum += i;
            }
        }
        return divisoresSum == n;
    }
}
