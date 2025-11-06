package Ativ16;

import java.util.Random;

public class exercicio8 {
    public static void main(String[] args) {
        Random Random = new Random();

        Random random = new Random();

        int totalMaquinas = 20; // número de máquinas no sistema
        int[] tempoOperacao = new int[totalMaquinas];
        int somaOperacao = 0;

        // Simula o tempo de operação de cada máquina até a próxima manutenção (em horas)
        for (int i = 0; i < totalMaquinas; i++) {
            tempoOperacao[i] = 200 + random.nextInt(301); // 200 a 500 horas
            somaOperacao += tempoOperacao[i];
        }

        // Exibe os tempos de operação
        System.out.print("Tempo de operação das máquinas: [");
        for (int i = 0; i < totalMaquinas; i++) {
            System.out.print(tempoOperacao[i]);
            if (i < totalMaquinas - 1) System.out.print(", ");
        }
        System.out.println("]");

        // Exibe o total
        System.out.println("Total de horas de operação: " + somaOperacao + " horas");

    }
}
