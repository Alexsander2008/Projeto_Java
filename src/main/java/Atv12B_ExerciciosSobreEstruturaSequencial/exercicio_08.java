package Atv12B_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, resto;

        System.out.println("Digite o primeiro número:");
        n1= sc.nextInt();

        System.out.println("Digite o segundo número:");
        n2= sc.nextInt();

        resto= n1%n2;

        System.out.println(n1+"/"+ n2+ "="+ (n1/n2));
        System.out.println("O resto da divisão é: "+ resto);
    }
}