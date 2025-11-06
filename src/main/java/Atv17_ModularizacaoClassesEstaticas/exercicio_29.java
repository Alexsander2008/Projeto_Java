package main.java.Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_29 {
    public static void main() {
        Scanner sc=new Scanner(System.in);

        int defeito;

        System.out.println("Digite a quantidade de defeitos");
        defeito=sc.nextInt();


        inspecao(defeito);
    }
    public static void inspecao (int def) {

        if (def>=20) {
            System.out.println("Reporvar");
        }
        else if (def>=10) {
            System.out.println("Retrabalhar");
        }
        else
            System.out.println("Aprovar");
    }
}
