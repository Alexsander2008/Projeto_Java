package Ativ16;

import java.util.Random;

public class exercicio4 {
    public static void main(String[] args) {

        Random random = new Random();

        int totalPecas = 200;
        int[] defeitosPorLote = new int[totalPecas];
        int totalDefeituosas = 0;

        //Simula a quantidade de defeitos em cada peça (0 a 2 defeitos por peça)
        for (int i = 0; i < totalPecas; i++) {
            defeitosPorLote[i] = random.nextInt(3); // 0, 1 ou 2 defeitos
            totalDefeituosas += defeitosPorLote[i];
        }

        //Calcula a porcentagem de peças defeituosas
        double porcentagemDefeituosas = ((double) totalDefeituosas / (totalPecas * 1)) * 100;

        //Exibe as informações
        System.out.print("Peças defeituosas registradas: [");
        for (int i = 0; i < 20; i++) { // mostra só uma amostra das 200
            System.out.print(defeitosPorLote[i]);
            if (i < 19) System.out.print(", ");
        }
        System.out.println(", ...]");

        System.out.println("Total de peças defeituosas: " + totalDefeituosas);
        System.out.printf("Porcentagem de defeituosas: %.2f%%\n", porcentagemDefeituosas);

    }
}
