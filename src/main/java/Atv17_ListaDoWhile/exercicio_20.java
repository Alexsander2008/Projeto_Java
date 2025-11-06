package Atv17_ListaDoWhile;

import java.util.Scanner;

/* AS/RS: Significa Sistema Automatizado de Armazenamento e Recuperação (do inglês, Automated Storage and Retrieval System),
 um sistema controlado por computador que utiliza máquinas e robôs para automatizar o armazenamento e a
 recuperação de mercadorias em armazéns, centros de distribuição e fábricas. */

public class exercicio_20 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prateleiras, quantidade;
        char val;

        System.out.println("Digite a quantidade de prateleiras:");
        prateleiras = sc.nextInt();

        do {
            quantidade = 0;

            for (int i=1; i<=prateleiras; i++) {
                System.out.println("A prateleira "+i+" foi validada? (s/n)");
                val = sc.next().charAt(0);
                if (val == 's') {
                    quantidade++;
                }
            }

            System.out.println(quantidade);
            if (quantidade != prateleiras) {
                System.out.println("Nem todas as prateleiras foram validadas");
                System.out.println("Reiniciando validação...");
            }

        } while (quantidade!=prateleiras);

        System.out.println("Inventário concluido!");
        sc.close();
    }
}
