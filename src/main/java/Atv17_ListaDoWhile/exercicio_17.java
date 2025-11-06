package Atv17_ListaDoWhile;

import java.util.Scanner;

/* RMS: (Raiz Quadrática Média) é uma medição do volume médio de um sinal de áudio ou da potência
 contínua de um alto-falante, representando a média do sinal ao longo do tempo */

public class exercicio_17 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rms;
        int leituras=0, somaRMS=0;

        do {
            System.out.println("Digite o nível de RMS:");
            rms=sc.nextDouble();

            if (rms<2.5) {
                somaRMS++;

                while (rms<2.5) {
                    System.out.println("Digite o nível de RMS:");
                    rms = sc.nextDouble();
                    somaRMS++;
                    leituras++;

                    if (rms>=2.5){
                        somaRMS=0;
                    } else if (somaRMS==3) {
                        break;
                    }
                }
            }
            leituras++;

        } while (somaRMS!=3);

        System.out.println("====================================");
        System.out.println("Leituras totais: "+leituras);
        System.out.println("====================================");
        sc.close();
    }
}
