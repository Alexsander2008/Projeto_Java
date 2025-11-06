package Desafios_de_Programação_Lógica;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int n= sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int contador=1; contador<=i; contador++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
