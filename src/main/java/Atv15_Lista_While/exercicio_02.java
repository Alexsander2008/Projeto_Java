package Atv15_Lista_While;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double leitura = 0;
        double soma = 0;

        while (leitura < 24) {
            System.out.println("Digite a temperatura da hora: " + (leitura + 1) + ": ");
            double temperatura = sc.nextDouble();
            soma = soma + temperatura;
            leitura++;
        }
        double media = soma / 24;
        System.out.println("A média de temperatura em 24 horas foi: " + media + "°C");
        sc.close();
    }
}
