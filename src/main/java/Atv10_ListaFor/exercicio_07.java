package Atv10_ListaFor;

import java.util.Random;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rd= new Random();
        int min, soma=0;

        System.out.println("Aperte ENTER para iniciar o programa.");
        sc.nextLine();

        for (int i=1; i<=20; i++) {
            min = rd.nextInt(25,50);
            soma+=min;
            System.out.println("Soldagem "+i+": "+min+" minutos");
            if (min>45){
                System.out.println("A soldagem "+i+" excedeu o tempo limite pré estabelecido em "+(min-45)+" minuto(s)");
            }
            System.out.println("---------------------------------------");
        }
        System.out.println("Tempo médio de soldagem: "+(soma/10));
        sc.close();
    }
}
