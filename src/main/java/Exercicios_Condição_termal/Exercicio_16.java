package Exercicios_Condição_termal;

import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        double n1 = sc.nextDouble();
        int multiplo = 5;
        String m = (n1 % multiplo== 0) ? "O numero é multiplo de 5" : "O numero não é multiplo de 5";
        System.out.println(m);
    }
}
