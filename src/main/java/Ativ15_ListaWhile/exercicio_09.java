package Ativ15_ListaWhile;

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  hora=1;
        double cons=1000;

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        while (hora<=5) {
            double percent=cons*0.1;
            cons+=percent;
            hora++;
        }
        System.out.printf("A energia consumida em 5 horas foi de "+cons+" watts");
        sc.close();
    }
}
