package Atv10_ListaFor;

import java.util.Random;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rd= new Random();
        int soma=0, cons;

        System.out.println("Aperte ENTER para iniciar o programa.");
        sc.nextLine();

        for (int i=1; i<=30; i++) {
            cons= rd.nextInt(100,500);
            System.out.println("Mês: "+i);
            System.out.println("Consumo: "+cons);
            System.out.println("-------------------");
            soma+=cons;
        }
        System.out.println("Estoque médio do material: "+(soma/30));
        sc.close();
    }
}
