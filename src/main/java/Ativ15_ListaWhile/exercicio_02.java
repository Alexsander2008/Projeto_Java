package Ativ15_ListaWhile;

import java.util.Random;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int hora=0, soma=0;

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        while (hora<=24) {

            int x=rand.nextInt(31);

            System.out.println("Temperatura da hora "+hora+": "+x);

            hora++;
            soma +=x;
        }
        int media=soma/24;
        System.out.println("A média da temperatura é: "+media);
        sc.close();
    }
}
