package Ativ15_ListaWhile;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=0;

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        while (x<=100) {
            x +=1;
            System.out.println("A peça "+x+" Foi montada!");
        }
        sc.close();
    }
}
