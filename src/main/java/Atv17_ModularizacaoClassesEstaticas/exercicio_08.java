package Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int material;

        do {
            System.out.println("Digite a quantidade de material da impressora em %");
            material= sc.nextInt();

            if (material<0 || material>100) {
                System.out.println("Digite um valor válido");
            }
        } while (material<0 || material>100);

        troca(material);
        sc.close();
    }

    public static void troca (int x) {
        if (x<20) {
            System.out.println("Trocar material de impressão");
        } else
            System.out.println("Prosseguindo com impressão");
    }
}
