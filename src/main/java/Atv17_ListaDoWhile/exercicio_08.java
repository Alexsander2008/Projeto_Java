package Atv17_ListaDoWhile;

import java.util.Scanner;
/* AGV significa "Automated Guided Vehicle" (Veículo Guiado Automatizado) e se refere a robôs móveis que
transportam materiais de forma autônoma em ambientes como fábricas, armazéns e centros logísticos. */

public class exercicio_08 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caixas, soma=0, viagens=0;

        do {
            System.out.println("Digite a quantidade de caixas entregues na estação: ");
            caixas = sc.nextInt();
            soma+=caixas;
            viagens++;
        } while (caixas<=50);

        System.out.println("Viagens: "+viagens+" | Caixas: "+soma);
    }
}
