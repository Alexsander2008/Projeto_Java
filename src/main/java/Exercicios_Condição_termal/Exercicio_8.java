package Exercicios_Condição_termal;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int n = sc.nextInt();
        String idade = (n<12) ? "infantil" : (n<18) ? "juvenil" : "adulto";
        System.out.println("Você é "+idade);
    }
}
