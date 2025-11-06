package Atv10_ListaFor;

import java.util.Random;
import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rd= new Random();
        int temp, soma=0;

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        for (int i=1; i<=10; i++){
            temp= rd.nextInt(100,400);
            System.out.println("Máquina: "+i);
            System.out.println("Tempo de operação: "+temp);
            soma+=temp;
        }
        System.out.println("Total de horas de operação: "+soma);
        sc.close();
    }
}
