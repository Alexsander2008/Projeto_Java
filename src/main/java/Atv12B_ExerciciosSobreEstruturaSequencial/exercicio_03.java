package Atv12B_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double raio,pi;

        pi= 3.14;

        System.out.println("Digite o raio do círculo.");
        raio= sc.nextDouble();

        System.out.println("A área do círculo é: " + pi*Math.pow(raio, 2));

    }
}
