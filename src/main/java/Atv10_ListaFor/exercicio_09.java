package Atv10_ListaFor;

import java.util.Random;
import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rd= new Random();
        int prev, soma=0;

        System.out.println("Aperte ENTER para iniciar o programa.");
        sc.nextLine();

        for (int i=1; i<=10; i++){
            prev= rd.nextInt(1000,2000);
            System.out.println("Previsão de damanda para o produto "+i+": "+prev);
            soma+=prev;
        }
        System.out.println("Previsão média: "+(soma/10));

        sc.close();
    }
}
