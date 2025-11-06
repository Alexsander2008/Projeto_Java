package Atv10_ListaFor;

import java.util.Random;
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rd= new Random();
        int qual, aprov=0;

        for (int i=1; i<=20; i++) {
            qual= rd.nextInt(80,100);
            System.out.println("Qualidade da peça "+i+": "+qual);

            if (qual>=90) {
                System.out.println("Peça "+i+" aprovada");
                aprov++;
            }


            System.out.println("--------------------------------------");
        }
        double porcent= (double) (aprov *100)/20;
        System.out.println("Peças aprovadas: "+aprov);
        System.out.println("Total aprovado: "+porcent+"%");

        sc.close();
    }
}
