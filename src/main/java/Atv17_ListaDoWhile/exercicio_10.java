package Atv17_ListaDoWhile;

import java.util.Scanner;

/* OEE: Significa Overall Equipment Effectiveness, que em português é Eficiência Global do Equipamento.
É uma métrica industrial que mede a eficiência real dos equipamentos,
calculando a porcentagem do tempo de produção que é verdadeiramente produtiva. */

public class exercicio_10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prod, para, ciclos=0, paradas=0;
        char sair;

        do {
            System.out.println("Digite a quantidade de ciclos de produção");
            prod = sc.nextInt();
            System.out.println("Digite o número de paradas");
            para = sc.nextInt();

            do {
                if (prod <= 0) {
                    System.out.println("Digite uma quantidade de ciclos válida");
                    prod = sc.nextInt();
                } else if (para < 0) {
                    System.out.println("Digite um numero de paradas válida");
                    para = sc.nextInt();
                }
            } while (prod <= 0 || para < 0);

            ciclos+=prod;
            paradas+=para;

            System.out.println("Deseja sair? (s/n)");
            sair = sc.next().charAt(0);

        } while (sair != 's');

        double disp= (double) ciclos/(ciclos+paradas);
        System.out.printf("Disponibilidade: %.2f%n", disp);
        sc.close();
    }
}
