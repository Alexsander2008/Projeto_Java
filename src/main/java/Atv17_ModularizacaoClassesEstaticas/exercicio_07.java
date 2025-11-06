package Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int peso;

        do {
            System.out.println("Digite o peso do pacote, para saber sua classificação");
            peso= sc.nextInt();

            if (peso<1) {
                System.out.println("Digite um valor válido");
            }
        } while (peso<1);

        classificacao(peso);
        sc.close();
    }

    public static void classificacao (int peso) {
        if (peso<10) {
            System.out.println("Peso leve");
        } else if (peso<=30) {
            System.out.println("Peso médio");
        } else if (peso<60) {
            System.out.println("Peso pesado");
        } else
            System.out.println("Peso muito pesado");
    }
}
