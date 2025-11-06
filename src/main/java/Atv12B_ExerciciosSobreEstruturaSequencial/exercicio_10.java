package Atv12B_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, media;

        System.out.println("Digite o primeiro número real");
        n1= sc.nextDouble();
        System.out.println("Digite o segundo número real");
        n2= sc.nextDouble();
        System.out.println("Digite o terceiro número real");
        n3= sc.nextDouble();

        media= ((n1+n2+n3)/3);

        System.out.println("A média aritmética dos três números é: "+media);
    }
}