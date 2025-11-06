package Atv17_ListaDoWhile;

import java.util.Scanner;

public class exercicio_11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int umidade;

        System.out.println("Digite a % de umidade: ");
        umidade = sc.nextInt();

        do {
            System.out.println("Nova leitura solicitada!");
            umidade = sc.nextInt();
        } while (umidade<30 || umidade>60);

        System.out.println("Umidade aceita: " + umidade+"%");
        sc.close();
    }
}
