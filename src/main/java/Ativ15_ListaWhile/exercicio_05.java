package Ativ15_ListaWhile;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int psi=0;

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        while (psi<=120){
            System.out.println("A pressão da máquina está em: "+psi+" psi");
            psi+=10;
        }

        System.out.println("Limite máximo de pressão atingido.");
        sc.close();
    }
}
