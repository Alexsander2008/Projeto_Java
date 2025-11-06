package Ativ15_ListaWhile;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int min=1, rpm=40;

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        while (rpm<=1000){
            System.out.print("Minuto: "+min);
            System.out.println(" Velocidade: "+rpm+" rpm");
            min+=2;
            rpm+=20;
        }
        sc.close();
    }
}
