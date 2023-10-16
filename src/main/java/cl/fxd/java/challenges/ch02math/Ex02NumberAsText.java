package cl.fxd.java.challenges.ch02math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Ex02NumberAsText {

    String numberAsText(int n){
        List<String> listado    = new ArrayList<>();
        var remanente           = n;
        Map<Integer,String> mapaNumeros = Map.of(
                0, "cero",
                1, "uno",
                2, "dos",
                3, "tres",
                4, "cuatro",
                5, "cinco",
                6, "seis",
                7, "siete",
                8, "ocho",
                9, "nueve");


        while (remanente>0){
            listado.add(mapaNumeros.get(remanente%10));
            remanente = remanente / 10;
        }

        StringBuilder miSb = new StringBuilder();
        Collections.reverse(listado);

        int largo = listado.size();
        int count = 1;

        for (String palabra: listado) {
            if (count < largo){
                miSb.append(palabra + " ");
            } else {
                miSb.append(palabra);
            }
            count++;
        }

        return miSb.toString();
    }
}
