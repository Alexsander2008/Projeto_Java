package Exercicios_Condição_termal;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade para ver se você pode votar");
        int idade = sc.nextInt();
        String votar = (idade<16) ? "pode votar" : "não pode votar";
        System.out.println("Você "+votar);
    }
}
