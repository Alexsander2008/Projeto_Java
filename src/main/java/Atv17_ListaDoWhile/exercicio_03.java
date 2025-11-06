package Atv17_ListaDoWhile;

import java.util.Scanner;

/* RFID: É a sigla para Identificação por Radiofrequência, um sistema que usa ondas de rádio para identificar
 e rastrear objetos sem a necessidade de contato visual ou alinhamento com um leitor. */

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String cod;

        do {
            System.out.println("Digite o código alfanumérico");
            cod= sc.nextLine();

            if (cod.length()!=8) {
                System.out.println("Código invalido!");
                System.out.println("Digite o código alfanumérico novamente");
            }

        } while (cod.length()!=8);

        System.out.println("Código aceito");
        sc.close();
    }
}