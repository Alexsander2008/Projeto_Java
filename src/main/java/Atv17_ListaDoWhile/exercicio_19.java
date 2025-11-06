package Atv17_ListaDoWhile;

import java.util.Scanner;

public class exercicio_19 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pecas=0, falhas=0, ciclo=0;
        double porcent;

        do {
            ciclo++;
            System.out.println("Digite a quantidade de peças do ciclo "+ciclo+":");
            pecas+= sc.nextInt();
            System.out.println("Digite a quantidade de falhas do ciclo "+ciclo+":");
            falhas+= sc.nextInt();
            System.out.println("---------------------------------------------------------");

            porcent= (double) (falhas*100)/pecas;
        } while (porcent <= 2 || ciclo == 1);

        System.out.println("Taxa final: "+porcent+"%");
        sc.close();
    }
}
