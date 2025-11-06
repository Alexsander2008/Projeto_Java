package Ativ14_ListaTernaria;

import java.util.Scanner;

public class exercicio_20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite um número para verificar se ele é impar ou par");
        int n = sc.nextInt();

        String resul= (n%2!=0) ? n+" Não é par" : n+" É par";
        System.out.println(resul);
        sc.close();
    }
}
