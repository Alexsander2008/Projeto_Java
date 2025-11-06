package Atv16_Lista_FOR;

import java.util.Random;

public class exercicio_08 {
    public static void main(String[] args) {
        System.out.println("Controle de manutenção preventiva");
        Random random = new Random();
        int soma = 0;
        int ano = 365*24;
        for (int dia=0; dia<=365; dia++) {
            int d = random.nextInt(ano);
            System.out.println("Dia: "+dia+ " com "+d+ " horas de operação");
            soma+=d;
        }
        int total  = soma*ano;
        System.out.println("O total de horas de operação foi de: "+total);
    }
}
