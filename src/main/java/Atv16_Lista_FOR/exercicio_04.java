package Atv16_Lista_FOR;

import java.util.Random;

public class exercicio_04 {
    public static void main(String[] args) {
        System.out.println("Monitoramento de peças");

        Random r = new Random();
        int verificacao = r.nextInt();
        for (int i=0; i<200; i++ ) {
            System.out.println("eças produzidas: "+ i);
            verificacao=r.nextInt(200);
        }
        System.out.println("Peças defeituosas: "+verificacao);
        double media = (double) verificacao/200;
        System.out.printf("A media de peças defeituosas são: %.2f%%", media*100);
    }
}
