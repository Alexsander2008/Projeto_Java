package Ativ14_ListaTernaria;

import java.util.Scanner;

public class exercicio_17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite a temperatura atual em °C");
        int temp= sc.nextInt();

        String result= (temp>30) ? "O clima está quente" : "O clima está frio";
        System.out.println(result);
        sc.close();
    }
}
