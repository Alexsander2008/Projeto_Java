package Exercicios_Condição_termal;

import java.util.Scanner;

public class Exercicio_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n1 = sc.nextInt();
        System.out.println("Digite mais um numero");
        int n2 = sc.nextInt();
        int maior = (n1>n2) ? n1 : n2;
        System.out.println("O maior numero é o "+maior);
    }
}
