package Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String front, dir, esq;
        char resp;

        System.out.println("Digite apenas 'bloqueado' ou 'liberado'");
        do {
            do {
                System.out.println("Digite a leitura do sensor frontal (liberado/bloqueado)");
                front = sc.nextLine();
            } while (!front.equalsIgnoreCase("bloqueado") && !front.equalsIgnoreCase("liberado"));

            Frontal(front);

            do {
                System.out.println("Digite a leitura do sensor direito (liberado/bloqueado)");
                dir = sc.nextLine();
            } while (!dir.equalsIgnoreCase("bloqueado") && !dir.equalsIgnoreCase("liberado"));

            do {
                System.out.println("Digite a leitura do sensor esquerdo (liberado/bloqueado)");
                esq = sc.nextLine();
            } while (!esq.equalsIgnoreCase("bloqueado") && !esq.equalsIgnoreCase("liberado"));

            Lateral(dir, esq);

            System.out.println("Gostaria de continuar? s/n");
            resp = sc.next().charAt(0);
            System.out.println("-------------------------------------");
        } while (resp != 'n');

        sc.close();
    }

    public static void Frontal( String front) {

        if (front.equalsIgnoreCase("liberado")) {
            System.out.println("Seguindo em frente");
        } else
            System.out.println("Não é possível seguir em frente");
    }

    public static void Lateral(String dir, String esq) {
        Scanner sc = new Scanner(System.in);

        if (dir.equalsIgnoreCase("liberado") && esq.equalsIgnoreCase("liberado")) {
            String lado;

            do {
                System.out.println("Digite para qual lado seguir (esquerda/direita)");
                lado = sc.nextLine();
            } while (!lado.equalsIgnoreCase("direita") && !lado.equalsIgnoreCase("esquerda"));
            
            if (lado.equalsIgnoreCase("esquerda")) {
                System.out.println("Seguindo para a esquerda");
            } else
                System.out.println("Seguindo para a direita");
            
        } else if (dir.equalsIgnoreCase("liberado") && esq.equalsIgnoreCase("bloqueado")) {
            System.out.println("Seguindo para a direita");
        } else
            System.out.println("Seguindo para a esquerda");

        sc.close();
    }
}