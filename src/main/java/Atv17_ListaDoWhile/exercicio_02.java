package Atv17_ListaDoWhile;

import java.util.Scanner;

// CNC: Comando Numérico Computadorizado, uma tecnologia que controla máquinas por computador para a fabricação de peças

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int ciclos=0, pecas, soma=0;

        do {
            System.out.println("Informe quantas peças foram produzidas");
            pecas=sc.nextInt();
            soma+=pecas;
            ciclos++;

        } while (soma<120);

        System.out.println("Total produzido: "+soma);
        System.out.println("Ciclos: "+ciclos);
    }
}