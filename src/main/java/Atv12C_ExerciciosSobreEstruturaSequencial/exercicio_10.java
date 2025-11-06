package Atv12C_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double alt, ideal;

        System.out.println("Digite sua altura");
        alt= sc.nextDouble();

        ideal= (72.7*alt-58);

        System.out.printf("O seu peso ideal é: %.1f kg %n", ideal);
    }
}
