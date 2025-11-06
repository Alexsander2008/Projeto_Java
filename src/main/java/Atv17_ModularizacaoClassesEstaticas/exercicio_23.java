package main.java.Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int traf;

        System.out.println("Digite a porcentagem de trafego suspeito");
        traf=sc.nextInt();

        System.out.println(trafego(traf));
    }
    public static String trafego (int por) {

        String trafego;

        if (por>70) {
            trafego="Bloquear acesso";
        }
        else if (por>30) {
            trafego="Ficar em alerta";
        }
        else
            trafego="normal";

        return trafego;
    }
}
