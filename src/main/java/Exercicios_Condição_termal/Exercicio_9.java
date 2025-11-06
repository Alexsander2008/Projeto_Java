package Exercicios_Condição_termal;

import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int n1 = sc.nextInt();
        System.out.println("Digite um numero inteiro");
        int n2 = sc.nextInt();
        String numero = (n1<n2) ? "menor" : "maior";
        System.out.println("O numero maior é o "+numero);
    }
}
