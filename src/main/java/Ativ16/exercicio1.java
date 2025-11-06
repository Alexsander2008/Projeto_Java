package Ativ16;

import java.util.Random;

public class exercicio1 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] eficiencias = new int[100];
        int soma = 0;

        //gera eficiências aleatórias entre 0 e 100
        for (int i = 0; i < eficiencias.length; i++) {
            eficiencias[i] = random.nextInt(101); // 0 a 100
            soma += eficiencias[i];
        }

        //calcula a média
        double media = (double) soma / eficiencias.length;

        //exibe as eficiências
        System.out.print("Eficiência das 100 máquinas: [");
        for (int i = 0; i < eficiencias.length; i++) {
            System.out.print(eficiencias[i]);
            if (i < eficiencias.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //exibe a média formatada
        System.out.printf("Média de eficiência: %.2f%%\n", media);
    }
}
