package Desafios_de_Programação_Lógica;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        System.out.println("1 2 3 4 5 6 7 8 9 10");
        for (int i= 1; i<=10; i++) {
            for (int mult=1; mult<=10; mult++) {
                System.out.print(i*mult+" ");
            }
            System.out.println();
        }
    }
}
