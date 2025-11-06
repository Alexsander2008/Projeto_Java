package Ativ14_ListaTernaria;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num;

        System.out.println("Digite o número");
        num=sc.nextInt();

        String resul=(num>=0) ? "O número é positivo" : "O número é negativo";

        System.out.println(resul);
        sc.close();
    }
}
