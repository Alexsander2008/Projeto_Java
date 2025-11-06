package Ativ16;

import java.util.Random;

public class exercicio9 {
    public static void main(String[] args) {
        Random random = new Random();

        int produtos = 10;
        int[] previsaoDemanda = new int[produtos];
        int soma = 0;

        // Simula a previsão de demanda mensal (entre 1000 e 2000 unidades por produto)
        for (int i = 0; i < produtos; i++) {
            previsaoDemanda[i] = 1000 + random.nextInt(1001); // 1000 a 2000
            soma += previsaoDemanda[i];
        }

        // Calcula a média da previsão
        double media = (double) soma / produtos;

        // Exibe a previsão de cada produto
        System.out.print("Previsão de demanda para 10 produtos: [");
        for (int i = 0; i < produtos; i++) {
            System.out.print(previsaoDemanda[i]);
            if (i < produtos - 1) System.out.print(", ");
        }
        System.out.println("]");

        // Exibe a média
        System.out.printf("Previsão média de vendas: %.2f unidades\n", media);

    }
}
