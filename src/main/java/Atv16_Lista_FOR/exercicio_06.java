package Atv16_Lista_FOR;

import java.util.Random;

public class exercicio_06 {
    public static void main(String[] args) {
        Random random = new Random();
        int soma = 0;
        int media;
        for (int m=0; m<=30; m++) {
            int materiais = random.nextInt(500);
            System.out.println("No dia "+m+ "o estoque é de: "+materiais);
            soma+=materiais;
        }
        media = soma/50;
        System.out.println("A media de consumo de materiais foi de: "+media);
    }
}
