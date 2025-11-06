package Exercicios_Condição_termal;

import java.util.Scanner;

public class Exercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade para ver se voê pode votar");
        int n1 = sc.nextInt();
        String voto = (n1<16) ? "Você não pode votar" : "Você pode votar";
        System.out.println(voto);
    }
}
