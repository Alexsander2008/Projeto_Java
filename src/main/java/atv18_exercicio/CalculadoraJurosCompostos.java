package atv18_exercicio;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraJurosCompostos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inicial do investimento: ");
        double valorInicial = sc.nextDouble();

        if (valorInicial <= 0) {
            System.out.println("Valor inválido! O investimento deve ser maior que zero.");
        } else {
            System.out.print("Digite a taxa de juros (% ao mês): ");
            double taxa = sc.nextDouble() / 100.0;

            System.out.print("Digite o número de meses: ");
            int meses = sc.nextInt();

            double valorFinal = valorInicial;
            int contador = 0;

            while (contador < meses) {
                valorFinal += valorFinal * taxa;
                contador++;
            }

            System.out.printf("%nValor final após %d meses: R$ %.2f%n", meses, valorFinal);
        }

        sc.close();
    }
}
