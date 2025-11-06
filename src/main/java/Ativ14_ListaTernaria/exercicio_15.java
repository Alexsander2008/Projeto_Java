package Ativ14_ListaTernaria;

import java.util.Scanner;

public class exercicio_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade");
        idade=sc.nextInt();

        String resul=(idade>=16) ? "Você pode votar" : "Você não pode votar";

        System.out.println(resul);
        sc.close();
    }
}
