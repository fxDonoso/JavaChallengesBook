package cl.fxd.java.challenges.ch02math;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ex07RomanNumbers {
    Map<String, Integer> mapaRomano;
    Map<Double, String> mapaRomanoReverso;

    Ex07RomanNumbers(){
        mapaRomano = Map.of(
                "I",1,
                "V",5,
                "X",10,
                "L",50,
                "C",100,
                "D",500,
                "M", 1000);
        mapaRomanoReverso = Map.of(
                1.0,"I",
                5.0,"V",
                10.0,"X",
                50.0,"L",
                100.0,"C",
                500.0,"D",
                1000.0,"M");
    }

    int fromRomanNumber(String romano){
        int largoRomano = romano.length();
        int[] numeros   = new int[largoRomano];
        int suma        = 0;

        for (int i = 0; i< largoRomano; i++){
            numeros[i] = mapaRomano.get(romano.substring(i, i+1));
        }

        int actual          = 0;
        int siguiente       = 0;
        int subSiguiente    = 0;

        for (int i = 0; i < numeros.length; i++){
            actual          = numeros[i];
            siguiente       = i+1;
            subSiguiente    = i+2;

            if (subSiguiente < numeros.length){
                if (actual < numeros[siguiente] || actual < numeros[subSiguiente]){
                    suma -= numeros[i];
                } else {
                    suma += numeros[i];
                }
            } else if (siguiente < numeros.length) {
                if (actual < numeros[siguiente]){
                    suma -= numeros[i];
                } else {
                    suma += numeros[i];
                }
            } else {
                suma += numeros[i];
            }
        }
        return suma;
    }

    String toRomanNumber (int numero){
        int[] numeros = new int[String.valueOf(numero).length()];
        int largo = numeros.length;
        List<String> romanos = new ArrayList<>();

        for (int i = 0 ; i < largo; i++){
            numeros[i] =Integer.parseInt(String.valueOf(numero).substring(i,i+1));
        }

        int digito = 0;
        double equivalente = 0;

        for (int i = 0; i< numeros.length; i++){
            digito = numeros[i];
            if (digito< 5){
                if (digito % 5 <= 3){
                    for(int j = 0; j< digito%10; j++){
                        equivalente = Math.pow (10, (largo - (double) (i+1)));
                        romanos.add(stringEquivalente(equivalente));
                    }
                } else{
                    String aux =
                            stringEquivalente(Math.pow (10,  (largo - (double) (i+1))));
                    romanos.add(aux);
                    String aux2 =
                            stringEquivalente(5 * Math.pow (10,  (largo - (double) (i+1))));
                    romanos.add(aux2);
                }
            } else {
                if (digito % 5 <= 3){
                    romanos.add(stringEquivalente(5 * Math.pow (10, (largo - (double) (i+1)))));
                    for(int j = 0; j< (digito-5)%10; j++){
                        equivalente = Math.pow (10, (largo - (double) (i+1)));
                        romanos.add(stringEquivalente(equivalente));
                    }
                } else{
                    String aux =
                            stringEquivalente(10 * Math.pow (10,  (largo - (double) (i+1))));
                    String aux2 =
                            stringEquivalente(Math.pow (10,  (largo - (double) (i+1))));

                    romanos.add(aux2);
                    romanos.add(aux);
                }
            }
        }

        return String.join("", romanos);
    }

    String stringEquivalente(double numero){
        return mapaRomanoReverso.get(numero);
    }



}
