package main.java.Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int acido;

        System.out.println("Digite o ph");
        acido=sc.nextInt();

        industria(acido);
    }

    public static void industria (int quim) {
        if (quim<7) {
            System.out.println("E um acido");
        }
        else if (quim==7) {
            System.out.println("E um neutro");
        }
        else
            System.out.println("E um basico");
    }
}
