package Atv16_Lista_FOR;

import java.util.Random;

public class exercicio_07 {
    public static void main(String[] args) {
        System.out.println("Verificação da qualidade de soldagem");
        Random random = new Random();
        int soma = 0;
        for (int soldagem = 0; soldagem<50; soldagem++) {
            int minuto = random.nextInt(60);
            System.out.println("Soldagem "+soldagem+ "concluida. Tempo gasto: "+minuto+ "minutos");
            soma+=minuto;
        }
        double media = (double) soma/60;
        System.out.printf("O tempo medio de cada soldagem foi de: %.2f minutos",media);
    }
}
