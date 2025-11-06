package Atv17_ListaDoWhile;

import java.util.Scanner;

public class exercicio_09 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean resul;
        int tentativas=0, peca=1;

        do {
            System.out.println("Digite o resultado do teste da peça "+peca+" (true/false):");
            resul = sc.nextBoolean();
            tentativas++;
            peca++;

        } while (resul!=true);

        System.out.println("Tentativas: "+tentativas);
        sc.close();
    }
}
