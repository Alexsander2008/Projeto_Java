package atv18_exercicio;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2;
        String op;

        System.out.println("Digite o primeiro número:");
        n1 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        n2 = sc.nextDouble();

        System.out.println("Digite a operação:");
        op = sc.next();

        if (op.equals("multiplicacao") || op.equals("*")) {
            System.out.println("Resultado: " + (n1 * n2));
        } else if (op.equals("divisao") || op.equals("/")) {
            System.out.println("Resultado: " + (n1 / n2));
        } else if (op.equals("soma") || op.equals("+")) {
            System.out.println("Resultado: " + (n1 + n2));
        } else if (op.equals("subtracao") || op.equals("-")) {
            System.out.println("Resultado: " + (n1 - n2));
        } else {
            System.out.println("Operação inválida!");
        }

        sc.close();
    }
}
