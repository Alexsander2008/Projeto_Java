package Ativ15_ListaWhile;

import java.util.Random;
import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rand= new Random();
        int peca=0, falha=0;

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        while (peca<=9500 && falha<50){
            peca+=500;
            falha= rand.nextInt(20);
            falha+= falha;
        }
        System.out.println("Peças verificadas: "+peca);
        System.out.println("Número de falhas "+falha);
        sc.close();
    }
}