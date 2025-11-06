package Ativ14_ListaTernaria;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite a sua idade");
        int idade= sc.nextInt();

        String resp= (idade<12) ? "Classificação: infantil" : (idade<=18) ? "Classificação: juvenil" : "Classificação: adulto";
        System.out.println(resp);
        sc.close();
    }
}
