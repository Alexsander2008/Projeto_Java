package Ativ14_ListaTernaria;

import java.util.Scanner;

public class exercicio_16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é divisível por 5");
        int n= sc.nextInt();

        String resul= (n%5!=0) ? "Não é divisível" : "É divisível";
        System.out.println(resul);
        sc.close();
    }
}
