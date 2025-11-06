package Ativ15_ListaWhile;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int tempo=60, peca=1;

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        while (peca<=10){

            while (tempo>=0){
                System.out.println("Faltam "+tempo+" segundos para produzir a peça "+peca);
                tempo-=10;
            }
            tempo=60;
            peca++;
        }

        sc.close();
    }
}
