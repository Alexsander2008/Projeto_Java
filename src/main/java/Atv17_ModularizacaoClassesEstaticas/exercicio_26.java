package main.java.Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int tinta;

        System.out.println("Digite a bateria do robo");
        tinta=sc.nextInt();

        pintura(tinta);

    }
    public static void pintura (int robo) {

        if (robo<=15) {
            System.out.println("Parar");
        }
        else if (robo<=50) {
            System.out.println("Entrar em alerta");
        }
        else
            System.out.println("Continuar");
    }
}
