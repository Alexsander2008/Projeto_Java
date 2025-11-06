package Ativ16;

import java.util.Random;

public class exercicio5 {
    public static void main(String[] args) {
        Random Random = new Random();
        Random random = new Random();

        int maquinas = 10;
        int horas = 24;
        double[][] consumo = new double[maquinas][horas];
        double consumoTotal = 0;

        //Simula o consumo de energia de cada máquina por hora (entre 3.0 e 10.0 kWh)
        for (int i = 0; i < maquinas; i++) {
            for (int j = 0; j < horas; j++) {
                consumo[i][j] = 3.0 + random.nextDouble() * 7.0; // 3 a 10 kWh
                consumoTotal += consumo[i][j];
            }
        }

        //Mostra o consumo médio por máquina (só as primeiras 3 para exemplo)
        System.out.println("Consumo por hora (amostra das 3 primeiras máquinas):");
        for (int i = 0; i < 3; i++) {
            System.out.print("Máquina " + (i + 1) + ": [");
            for (int j = 0; j < horas; j++) {
                System.out.printf("%.1f", consumo[i][j]);
                if (j < horas - 1) System.out.print(", ");
            }
            System.out.println("]");
        }

        //Exibe o consumo total
        System.out.printf("\nConsumo total das 10 máquinas em 24h: %.2f kWh\n", consumoTotal);

    }
}
