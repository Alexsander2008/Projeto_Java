package main.java.Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String robsu1, robsu2;

        System.out.println("O robo A esta funcionando?");
        robsu1 = sc.nextLine();

        while (robsu1.equalsIgnoreCase("sim")) {
            System.out.println("Robo A em funcionamento");

            System.out.println("Robo A continua em funcionamento?");
            robsu1 = sc.nextLine();

        }

        System.out.println("Robo B sendo acionado");
        System.out.println("Robo B esta em funcionamento?");
        robsu2=sc.nextLine();

        while (robsu2.equalsIgnoreCase("sim")) {

            System.out.println("Robo B em funcionamento");

            System.out.println("Robo B continua em funcionamento?");
            robsu2 = sc.nextLine();

            robo(robsu1, robsu2);
        }

    }
    public static void robo (String falha1, String falha2) {

        if (falha2.equalsIgnoreCase("nao")) {
            System.out.println("Verificando sistema...");
        }

        if (falha1.equalsIgnoreCase("nao") && falha2.equalsIgnoreCase("nao")) {
            System.out.println("parar a linha");
        }

    }

}