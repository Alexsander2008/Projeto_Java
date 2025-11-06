package Ativ16;

import java.util.Random;

public class exercicio7 {
    public static void main(String[] args) {
        Random Random = new Random();

        Random random = new Random();

        int totalSoldagens = 50; // número de soldagens realizadas
        int[] tempos = new int[totalSoldagens];
        int soma = 0;
        int limite = 40; // tempo limite permitido em minutos
        boolean excedeuLimite = false;

        //Simula tempos de soldagem (entre 25 e 45 minutos)
        for (int i = 0; i < totalSoldagens; i++) {
            tempos[i] = 25 + random.nextInt(21); // 25 a 45
            soma += tempos[i];
            if (tempos[i] > limite) {
                excedeuLimite = true;
            }
        }

        //Calcula o tempo médio
        double media = (double) soma / totalSoldagens;

        //Exibe os tempos
        System.out.print("Tempos de soldagem: [");
        for (int i = 0; i < totalSoldagens; i++) {
            System.out.print(tempos[i]);
            if (i < totalSoldagens - 1) System.out.print(", ");
        }
        System.out.println("]");

        //Exibe resultados
        System.out.printf("Tempo médio: %.2f minutos\n", media);

        if (excedeuLimite) {
            System.out.println("⚠️ Atenção: Houve soldagens que excederam o limite de " + limite + " minutos!");
        } else {
            System.out.println("✅ Nenhuma soldagem excedeu o limite de " + limite + " minutos.");

        }
    }
}
