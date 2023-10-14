package cl.fxd.java.challenges.ch02math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex02NumberAsText {

    String numberAsText(int n){
        List<String> listado    = new ArrayList<>();
        String valorComoTexto   = "";
        var remanente           = n;

        while (remanente>0){
            switch (remanente%10){
                case 0:
                    listado.add("cero");
                    break;
                case 1:
                    listado.add("uno");
                    break;
                case 2:
                    listado.add("dos");
                    break;
                case 3:
                    listado.add("tres");
                    break;
                case 4:
                    listado.add("cuatro");
                    break;
                case 5:
                    listado.add("cinco");
                    break;
                case 6:
                    listado.add("seis");
                    break;
                case 7:
                    listado.add("siete");
                    break;
                case 8:
                    listado.add("ocho");
                    break;
                case 9:
                    listado.add("nueve");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: "
                            + remanente % 10);
            }

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

        valorComoTexto = miSb.toString();
        return valorComoTexto;
    }
}
