package atv18_exercicio;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura e a unidade:");
        String entrada = sc.nextLine();

        String[] partes = entrada.split(" ");

        double g = Double.parseDouble(partes[0]);
        String unidade = partes[1].toUpperCase();

        if (unidade.equals("C")) {
            double fahrenheit = (g * 9 / 5) + 32;
            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        } else if (unidade.equals("F")) {
            double celsius = (g - 32) * 5 / 9;
            System.out.println("Temperatura em Celsius: " + celsius);
        } else {
            System.out.println("Unidade inválida! Use C ou F.");
        }

        sc.close();
    }
}

