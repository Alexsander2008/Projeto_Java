package Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int horasUso;

        do {
            System.out.println("Digite as horas de uso da máquina para saber sua urgência de manutenção");
            horasUso= sc.nextInt();

            if (horasUso<0) {
                System.out.println("Digite um valor válido");
            }
        } while (horasUso<0);

        urgencia(horasUso);
        sc.close();

    }
    public static void urgencia (int h) {
        if (h<500) {
            System.out.println("Urgência básica");
        } else if (h>=500 && h<=1000) {
            System.out.println("Urgência média");
        } else
            System.out.println("Urgência alta");
    }
}
