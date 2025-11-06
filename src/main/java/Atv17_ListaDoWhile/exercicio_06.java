package Atv17_ListaDoWhile;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String insp;
        int aprov=0, reprov=0;

        do {
            System.out.println("Digite o resultado da inspeção visual:");
            System.out.println("'A'= aprovado");
            System.out.println("'R'= reprovado");
            System.out.println("sair= para sair do programa");
            insp= sc.nextLine();

            if (insp.equalsIgnoreCase("a")){
                aprov++;
            } else if (insp.equalsIgnoreCase("r")) {
                reprov++;
            } else if (insp.equalsIgnoreCase("sair")) {
                System.out.println("Fechando o programa...");
            } else
                System.out.println("Digite uma opção válida");
        } while (!insp.equalsIgnoreCase("sair"));

        System.out.println("Aprovadas: "+aprov+" | Reprovadas: "+reprov);
        sc.close();

    }
}
