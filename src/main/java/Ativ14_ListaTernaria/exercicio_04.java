package Ativ14_ListaTernaria;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int temp;

        System.out.println("Digite a temperatura");
        temp=sc.nextInt();

        String resul=(temp>18) ? "Ta quente" : "Ta frio";

        System.out.println(resul);
        sc.close();
    }
}
