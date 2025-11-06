package atv18_exercicio;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas notas o aluno tem? ");
        int n = sc.nextInt();

        double soma = 0.0;

        // Lê as notas e acumula a soma
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = sc.nextDouble();
            soma += nota;
        }

        double media = soma / n;

        System.out.printf("%nMédia do aluno: %.2f%n", media);

        if (media >= 7.0) {
            System.out.println("Situação: Aprovado ✅");
        } else if (media >= 5.0) {
            System.out.println("Situação: Recuperação ⚠️");
        } else {
            System.out.println("Situação: Reprovado ❌");
        }

        sc.close();
    }
}