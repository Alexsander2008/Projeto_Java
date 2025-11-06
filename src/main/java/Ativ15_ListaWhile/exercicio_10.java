package Ativ15_ListaWhile;

import java.util.Random;
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        char resp;
        do {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            int verif = 0, falha = 0, soma=0;

            while (verif < 5) {
                falha = rand.nextInt(2);
                verif += 1;
                System.out.println("Verificação " + verif + " apresentou " + falha + " falha");
                soma+= falha;
            }

            System.out.println(soma+" falhas dectadas.");

            if (soma == 5) {
                System.out.println("Interrompendo funcionamento");
            } else {
                System.out.println("Funcinamento do sistema normal.");
            }

            System.out.println("Deseja continuar? (s/n)");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
    }
}