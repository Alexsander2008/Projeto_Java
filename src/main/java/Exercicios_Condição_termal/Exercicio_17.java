package Exercicios_Condição_termal;

import java.util.Scanner;

public class Exercicio_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura do dia");
        double t = sc.nextDouble();
        String te = (t<30) ? "O clima está frio" : "O clima está qunente";
        System.out.println(te);
    }
}
