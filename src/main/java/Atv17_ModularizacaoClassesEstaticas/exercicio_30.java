package main.java.Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int temperatura;

        System.out.println("Digite a temperatura");
        temperatura=sc.nextInt();

        industria(temperatura);
    }
    public static void industria (int temp) {

        if (temp>=80) {
            System.out.println("desligar servidores");
        }
        else if (temp>=60) {
            System.out.println("Resfriamento extra");
        }
        else
            System.out.println("normal");
    }
}
