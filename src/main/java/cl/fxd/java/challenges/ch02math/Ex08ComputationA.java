package cl.fxd.java.challenges.ch02math;

public class Ex08ComputationA {


    void calcularABC(){
        for (int i = 1; i <=100; i++){
            for (int j = 1; j <=100; j++){
                int c =(int) Math.sqrt(i*i+j*j);
                if (c<100 && i*i+j*j==c*c){
                    System.out.println("a:" + i + " - b:" + j + " - c:" + c);
                }

            }
        }
    }
}
