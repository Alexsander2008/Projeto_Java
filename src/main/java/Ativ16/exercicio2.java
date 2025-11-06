package Ativ16;

import java.util.Random;

public class exercicio2 {
    public static void main(String[] args) {
        Random random = new Random();

        int minutos = 12 * 60; // 12 horas * 60 minutos = 720 medições
        int[] temperaturas = new int[minutos];
        int soma = 0;

        //Simula medições de temperatura entre 300°C e 450°C
        for (int i = 0; i < minutos; i++) {
            temperaturas[i] = 300 + random.nextInt(151); // gera entre 300 e 450
            soma += temperaturas[i];
        }

        //Calcula a média
        double media = (double) soma / minutos;

        //Exibe apenas as primeiras 20 medições para não ficar muito grande
        System.out.print("Temperaturas registradas (amostra): [");
        for (int i = 0; i < 20; i++) {
            System.out.print(temperaturas[i]);
            if (i < 19) {
                System.out.print(", ");
            }
        }
        System.out.println(", ...]");

        //Exibe a média
        System.out.printf("Média de temperatura durante as 12h: %.2f°C\n", media);


    }
}
