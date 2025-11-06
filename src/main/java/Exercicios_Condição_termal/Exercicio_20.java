package Exercicios_Condição_termal;

import java.util.Scanner;

public class Exercicio_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        double n1 = sc.nextDouble();
        String r = (n1 % 2 == 0) ? "O numero é par" : "O numero é ímpar";
        System.out.println(r);
    }
}
