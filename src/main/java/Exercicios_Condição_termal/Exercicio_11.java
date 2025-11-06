package Exercicios_Condição_termal;

import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        double n1 = sc.nextDouble();
        String r = (n1>0) ? "positivo" : (n1 == 0) ? "zero" : "negativo";
        System.out.println("O numero é "+r);
    }
}
