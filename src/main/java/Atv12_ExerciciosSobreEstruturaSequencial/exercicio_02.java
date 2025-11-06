package Atv12_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;
public class exercicio_02 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double raio;
        double pi=3.14159;

        System.out.println("Digite o raio do círculo");

        raio= sc.nextDouble();

        double area=pi*Math.pow(raio, 2);

        System.out.printf("O valor da área do círculo proposto é: %.4f %n", area);

        sc.close();
    }
}
