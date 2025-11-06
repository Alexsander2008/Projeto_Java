package Atv10_ListaFor;

import java.util.Random;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {

        Random rd=new Random();
        Scanner sc=new Scanner(System.in);

        System.out.println("Presisone ENTER para iniciar o programa");
        sc.nextLine();

        int soma=0;

        for (int maq=1; maq<=10; maq++) {

            for (int hora=1; hora<=24; hora++) {

                int x=rd.nextInt(9);

                System.out.println("Consumo da máquina "+maq+" na hora "+hora+": "+x);

                soma+=x;

            }
            System.out.println("Consumo da máquina "+maq+" em 24 horas: "+soma);
        }
        sc.close();
    }
}
