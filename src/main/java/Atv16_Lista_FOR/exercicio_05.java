package Atv16_Lista_FOR;

import java.util.Locale;
import java.util.Random;

public class exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Controle de sonsumo de enrgia");
        Random energia = new Random();
        double soma = 0;
        for (int m=0; m<11; m++) {
                System.out.println("Maquina verificada: " + m);
                for (int hora = 0; hora <= 24; hora++) {
                int consumo = energia.nextInt(200);
                System.out.println("Na hora " + hora + " a maquina "+m+" teve a media de consumo foi de: " + consumo + "Kwh");
                soma += consumo;
            }
        }
        double media = (double) soma/10;
        System.out.printf("A media de consumo das maquinas foram de: %.2f kWh", media);
        }
    }
