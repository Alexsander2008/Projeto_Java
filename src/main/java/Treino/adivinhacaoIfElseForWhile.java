package Treino;

import java.util.Random;
import java.util.Scanner;

public class adivinhacaoIfElseForWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int x = random.nextInt(101);
        int tent;
        int tentG;

        System.out.println("Tente acertar um numero secreto de 0 a 100, com um limite de 30 tentativas!");

        System.out.println("Digite um numero");
        int y = sc.nextInt();

        for (tent = 30; tent > 0; tent--) {
            if (y == x) {
                System.out.println("Voce acertou, parabens!");
                break;
            }
                while (true) {
                    if (y != x) {
                        System.out.println("O numero digitado esta incorreto, tente novamente!");
                        tent--;
                        System.out.println("Total de tentativas restantes: " + tent);
                    }
                    if (y > x) {
                        System.out.println("Uma dica!! O numero " + y + " e maior que o numero secreto!");
                        y = sc.nextInt();
                    }
                    else if (y<x) {
                        System.out.println("Uma dica!! O numero " + y + " e menor que o numero secreto!");
                        y = sc.nextInt();
                    }
                    else {
                        System.out.println("Voce acertou! O numero secreto era: "+x);
                        tentG=30-tent;
                        System.out.println("Total de tentativas gastas: "+tentG);

                        return;

                    }

                }



        }

    }

}


