package Ativ15_ListaWhile;

import java.util.Random;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rand=new Random();
        int hora=0, soma=0;

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        while (hora<=8) {

            int x= rand.nextInt(51);
            System.out.println("Produção da hora "+hora+" :"+x);
            soma +=x;
            hora++;
        }
        System.out.println("soma das horas "+soma);
        sc.close();
    }
}
