package Ativ14_ListaTernaria;

import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int idade;
        String resul;

        System.out.println("Digite sua idade");
        idade=sc.nextInt();

        resul= (idade>=18) ? "Você é maior de idade" : "Você é menor de idade";

        System.out.println(resul);
        sc.close();
    }
}
