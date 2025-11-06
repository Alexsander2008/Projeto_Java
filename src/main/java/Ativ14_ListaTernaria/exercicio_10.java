package Ativ14_ListaTernaria;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é divisível por 3");
        int n= sc.nextInt();

        String resp= (n%3!=0) ? "Não é divisível por 3" : "É divisível por 3";
        System.out.println(resp);
        sc.close();
    }
}
