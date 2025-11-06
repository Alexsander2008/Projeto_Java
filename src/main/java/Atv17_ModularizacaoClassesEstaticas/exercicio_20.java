package main.java.Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int h;

        System.out.println("Digite a hora atual");
        h=sc.nextInt();

        System.out.println(turnos(h));
    }
    public static String turnos (int hora) {

        String turnos;

        if (hora<=12) {
            turnos="esta de manha";
        }
        else if (hora<=18) {
            turnos="esta de tarde";
        }
        else
            turnos="esta de noite";

        return turnos;
    }
}
