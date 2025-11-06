package Exercicios_Condição_termal;

import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        double n1 = sc.nextDouble();
        String divisivel = (n1 % 3 == 0) ? "divisivel" : "indivisivel";
        System.out.println("O numero é"+divisivel);
    }
}
