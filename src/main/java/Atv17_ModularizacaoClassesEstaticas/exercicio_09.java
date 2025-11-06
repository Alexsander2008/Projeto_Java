package Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int indice;

        do {
            System.out.println("Digite o índice de defeito do lote");
            indice= sc.nextInt();

            if (indice<0) {
                System.out.println("Digite uma resposta válida");
            }
        } while (indice<0);

        producao(indice);
        sc.close();
    }

    public static void producao (int def) {
        if (def>10) {
            System.out.println("Alerta acionado");
        } else
            System.out.println("Lote aprovado");
    }
}
