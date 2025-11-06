package atv18_exercicio;

import java.util.Scanner;

public class ContadorPalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();

        String[] palavras = frase.trim().split("\\s+");

        int contador = 0;

        int i = 0;
        while (i < palavras.length) {
            if (!palavras[i].isEmpty()) {
                contador++;
            }
            i++;
        }

        System.out.println("\nPalavras encontradas:");
        for (String p : palavras) {
            System.out.println(p);
        }

        System.out.println("\nNúmero de palavras: " + contador);

        sc.close();
    }
}