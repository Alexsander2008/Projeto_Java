package Atv16_Lista_FOR;

import java.util.Random;

public class exercicio_09 {
    public static void main(String[] args) {
        Random random = new Random();
        int soma = 0;
        for (int d=0; d<=31; d++) {
            int p = random.nextInt(1000);
            System.out.println("Previsão de demanda para o dia "+d+ "Foram feitas "+p+ " unidades");
            soma+=p;
        }
        double media =soma/31;
        System.out.println("A media de unidades produzidas foram de: "+media);
    }
}
