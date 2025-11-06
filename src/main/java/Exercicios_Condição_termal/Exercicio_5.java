package Exercicios_Condição_termal;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n = sc.nextInt();
        String resposta = (n % 2 == 0) ? "par" : "ímpar";
        System.out.println("O numero é "+resposta);
    }
}
