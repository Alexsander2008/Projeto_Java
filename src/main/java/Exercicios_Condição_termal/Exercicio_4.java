package Exercicios_Condição_termal;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura atual");
        double temperatura = sc.nextInt();
        String clima = (temperatura<18) ? "quente" : "frio";
        System.out.println("O clima está "+clima);
    }
}
