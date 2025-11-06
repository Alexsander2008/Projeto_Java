package Atv10_ListaFor;

import java.util.Random;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {

        Random rd=new Random();
        Scanner sc=new Scanner(System.in);

        System.out.println("Presisone ENTER para iniciar o programa");
        sc.nextLine();

        int soma=0;

        for (int dia=1; dia<=30; dia++) {

            int x=rd.nextInt(601);
            System.out.println("A produção do dia "+dia+" foi: "+x);
            soma+=x;
        }
        System.out.println("A produção total do mês foi: "+soma);
        System.out.println("A média diária de produção foi: "+soma/30);
        sc.close();
    }
}
