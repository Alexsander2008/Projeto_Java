package Desafios_de_Programação_Lógica;

import java.util.Random;
import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rd= new Random();

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        System.out.println("A máquina gerou um número aleatório entre 0 e 100, tente adivinha-lo");
        int aleatorio = rd.nextInt(0,100), palpite, tentativas=0;

        System.out.println("Digite seu palpite");
        palpite= sc.nextInt();
        tentativas++;
        do {
            if (palpite>aleatorio) {
                System.out.println("Tente um número mais baixo");
                palpite= sc.nextInt();
            }
            else if (palpite<aleatorio) {
                System.out.println("Tente um número mais alto");
                palpite= sc.nextInt();
            }
            tentativas++;
        } while (palpite!=aleatorio);

        System.out.println("Parabéns você acertou o número aleatório");
        System.out.println("Tentativas necessárias para acertar: "+tentativas);
        sc.close();
    }
}
