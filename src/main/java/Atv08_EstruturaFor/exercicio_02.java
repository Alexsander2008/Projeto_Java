package Atv08_EstruturaFor;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Aperte ENTER para inciar o programa");
        sc.nextLine();

        for (int sensor=1;sensor<6;sensor++) {
            System.out.println("Sensor "+sensor+" verificado");
        }
    }
}
