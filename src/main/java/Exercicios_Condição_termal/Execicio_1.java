package Exercicios_Condição_termal;

import java.util.Scanner;

public class Execicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade");
        int idade = sc.nextInt();
        String id = (idade<18) ? "menor de idade" : "maior de idade";
        System.out.println("Você é: "+id);
    }
}
