package Ativ15_ListaWhile;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int item= 500;

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        while (item>=100){
            System.out.println("O estoque possui "+item+" produtos");
            item -= 20;
        }
        sc.close();
    }
}
