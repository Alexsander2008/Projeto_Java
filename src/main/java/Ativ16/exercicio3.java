package Ativ16;

import java.util.Random;

public class exercicio3 {
    public static void main(String[] args) {
        Random random = new Random();

        int dias = 30;
        int[] producaoDiaria = new int[dias];
        int total = 0;

        //Simula a produção diária (valores entre 400 e 700 unidades)
        for (int i = 0; i < dias; i++) {
            producaoDiaria[i] = 400 + random.nextInt(301); // 400 a 700
            total += producaoDiaria[i];
        }

        //Calcula a média diária
        double media = (double) total / dias;

        //Exibe as produções diárias
        System.out.print("Produção diária: [");
        for (int i = 0; i < dias; i++) {
            System.out.print(producaoDiaria[i]);
            if (i < dias - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //Exibe o total e a média
        System.out.println("Produção total do mês: " + total + " unidades");
        System.out.printf("Média diária: %.2f unidades\n", media);

    }
}
