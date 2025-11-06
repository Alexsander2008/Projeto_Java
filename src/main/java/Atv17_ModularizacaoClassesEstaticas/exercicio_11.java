package Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int nivel;

        do {
            System.out.println("Digite o nível de bateria do drone");
            nivel= sc.nextInt();

            if (nivel<0 || nivel>100) {

                System.out.println("DIgite um nível válido");
            }

        } while (nivel<0 || nivel>100);

        drone(nivel);

    }

    public static void drone (int bat) {

        if (bat<20) {
            System.out.println("retorno imediato");
        }
        else if (bat>=20 && bat<=60) {
            System.out.println("rota curta");
        }
        else
            System.out.println("rota longa");
    }
}
