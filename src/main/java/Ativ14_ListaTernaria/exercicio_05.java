package Ativ14_ListaTernaria;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num;

        System.out.println("Digite um numero");
        num=sc.nextInt();

        String resul=(num%2!=0) ? "O numero é ímpar" : "O número é par";

        System.out.println(resul);
        sc.close();
    }
}
