package Ativ14_ListaTernaria;

import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num;

        System.out.println("Digite um numero");
        num=sc.nextInt();

        String resul=(num>0) ? "O número é positivo" : (num<0) ? "O número é negativo" : "O número é zero";

        System.out.println(resul);
        sc.close();
    }
}
