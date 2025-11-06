package Exercicios_Condição_termal;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero");
        double n1 = sc.nextDouble();
        String valor = (n1 < 0) ? "negativo" : "positivo";
        System.out.println("O valor é: "+valor);
    }
}
