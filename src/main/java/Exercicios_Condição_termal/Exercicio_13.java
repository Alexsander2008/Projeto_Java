package Exercicios_Condição_termal;

import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salario");
        double n1 = sc.nextDouble();
        String salario = (n1>3000) ? "alto" : "baixo";
        System.out.println("Você tem o salario "+salario);
    }
}
