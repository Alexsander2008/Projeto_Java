package Ativ16;

import java.util.Random;

public class exercicio6 {
    public static void main(String[] args) {
        Random Random = new Random();
        Random random = new Random();

        int tiposMateriais = 50;
        int[] consumoMensal = new int[tiposMateriais];
        int somaConsumo = 0;

        //Simula o consumo de cada tipo de material (entre 100 e 500 unidades por mês)
        for (int i = 0; i < tiposMateriais; i++) {
            consumoMensal[i] = 100 + random.nextInt(401); // 100 a 500
            somaConsumo += consumoMensal[i];
        }

        //Calcula o estoque médio
        double estoqueMedio = (double) somaConsumo / tiposMateriais;

        //Exibe os consumos
        System.out.print("Consumo de materiais: [");
        for (int i = 0; i < tiposMateriais; i++) {
            System.out.print(consumoMensal[i]);
            if (i < tiposMateriais - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //Exibe o estoque médio
        System.out.printf("Estoque médio: %.2f unidades\n", estoqueMedio);

    }
}
