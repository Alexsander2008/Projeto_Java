package main.java.Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int ele;

        System.out.println("Digite a intensidade eletrica");
        ele=sc.nextInt();

        sistema(ele);

    }
    public static void sistema (int sold) {

        if (sold<=100) {
            System.out.println("Intensidade fraca");
        }
        else if (sold<=200) {
            System.out.println("Intensidade media");

        }
        else
            System.out.println("Intensidade forte");
    }
}
