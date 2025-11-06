package Atv16_Lista_FOR;

import java.util.Random;
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota mínima para aprovação (n1): ");
        int n1 = scanner.nextInt();

        System.out.print("Quantos testes de qualidade você quer registrar? ");
        int quantidade = scanner.nextInt();

        int aprovados = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Resultado do teste " + i + ": ");
            int resultado = scanner.nextInt();

            if (resultado >= n1) {
                aprovados++;
            }
        }

        double Ap = ((double) aprovados / quantidade) * 100;

        System.out.println("\nTotal de embalagens testadas: " + quantidade);
        System.out.println("Total de embalagens aprovadas: " + aprovados);
        System.out.printf("Porcentagem de embalagens aprovadas: %.2f%%\n", Ap);

    }
}
