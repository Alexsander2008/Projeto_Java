package Exercicios_Condição_termal;

import java.util.Scanner;

public class Exercicio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int i = sc.nextInt();
        String idade = (i<18) ? "menor de idade" : "maior de idade";
        System.out.println("Você é: "+idade);
    }
}
