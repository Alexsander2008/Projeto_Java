package Atv12C_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double lado, area, per;

        System.out.println("Digite o lado do quadrado em cm");
        lado= sc.nextDouble();

        area= Math.pow(lado,2);
        per= lado*4;

        System.out.println("A área do quadrado é de: "+area+"cm²");
        System.out.println("O perímetro do quadrado é de: "+per+"cm");
    }
}
