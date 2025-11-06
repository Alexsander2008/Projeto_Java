package Ativ16;

import java.util.Random;

public class exercicio10 {
    public static void main(String[] args) {
        Random Random = new Random();

        Random random = new Random();

        int totalEmbalagens = 100; // número total de embalagens testadas
        int[] resultados = new int[totalEmbalagens];
        int aprovadas = 0;
        int limiteAprovacao = 80; // nota mínima para aprovação

        // Simula resultados dos testes (nota de 0 a 100)
        for (int i = 0; i < totalEmbalagens; i++) {
            resultados[i] = random.nextInt(101); // 0 a 100
            if (resultados[i] >= limiteAprovacao) {
                aprovadas++;
            }
        }

        // Calcula a porcentagem de aprovadas
        double porcentagemAprovadas = ((double) aprovadas / totalEmbalagens) * 100;

        // Exibe os resultados (apenas uma amostra das 20 primeiras)
        System.out.print("Resultados dos testes de qualidade (amostra): [");
        for (int i = 0; i < 20; i++) {
            System.out.print(resultados[i]);
            if (i < 19) System.out.print(", ");
        }
        System.out.println(", ...]");

        // Exibe a porcentagem de aprovadas
        System.out.printf("Total aprovado: %.2f%%\n", porcentagemAprovadas);

    }
}
