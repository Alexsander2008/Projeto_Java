package Exercicios_Condição_termal;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu salario");
        double s = sc.nextDouble();
        double imposto = (s>5.000) ? s*0.10 : s*0.20;
        System.out.println("O seu salario com imposto é de: "+imposto);
    }
}
