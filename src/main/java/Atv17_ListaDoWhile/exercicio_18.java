package Atv17_ListaDoWhile;

import java.util.Scanner;

// Takt time: É o ritmo de produção que uma empresa precisa manter para atender à demanda do cliente.

public class exercicio_18 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int takt, tempo, soma=0, estacoes=0;
        double media;

        System.out.println("Informe o takt:");
        takt = sc.nextInt();

        do {
            System.out.println("Digite o tempo da estação:");
            tempo = sc.nextInt();
            soma+=tempo;
            estacoes++;
            media= (double) soma/estacoes;
        } while (media<takt || estacoes==1);

        System.out.println("Média: "+media+" | Estações: "+estacoes);
        sc.close();
    }
}
