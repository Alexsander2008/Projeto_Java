package Atv17_ListaDoWhile;

import java.util.Scanner;

public class exercicio_16 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resul;
        int a=0, r=0;

        for (int i=1; i<=10; i++) {
            System.out.println("Digite o resultado da amostragem "+i+" (A/R):");
            resul = sc.next().charAt(0);

            if (resul!= 'A' && resul!= 'R') {
                do {
                    System.out.println("Digite um resultado válido");
                    resul = sc.next().charAt(0);
                } while (resul!= 'A' && resul!= 'R');
            }

            if (resul == 'A') {
                a++;
            } else if (resul == 'R') {
                r++;
            }
        }
        System.out.println("================================");
        System.out.println("Resultado:");
        System.out.println("A: "+a+" | R: "+r);
        System.out.println("================================");
        sc.close();
    }
}
