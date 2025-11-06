package Atv10_ListaFor;

import java.util.Random;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {

        Random rd=new Random();
        Scanner sc=new Scanner(System.in);

        System.out.println("Presisone ENTER para iniciar o programa");
        sc.nextLine();

        int soma=0;

        for (int hora=0; hora<=12; hora++) {
            System.out.println("Hora atual: "+hora);
            System.out.println("média de temperaturas: "+soma/60);
            soma=0;


            for (int min=1; min<=60; min++) {

                int temp=rd.nextInt(401);

                System.out.println("No minuto "+min+", A temperatura foi: "+temp);

                soma+=temp;
            }
        }
        sc.close();
    }
}
