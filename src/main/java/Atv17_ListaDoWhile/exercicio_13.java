package Atv17_ListaDoWhile;

import java.util.Scanner;

public class exercicio_13 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min, soma=0;
        char sair='n';

        do {
            System.out.println("Digite quantos minutos o tanque permaneceu misturando");
            min = sc.nextInt();
            soma += min;
            if (soma>=10){
                System.out.println("Deseja sair? (s/n)");
                sair = sc.next().charAt(0);
            }
        } while (sair!='s');

    System.out.println("Mistura encerrada aos "+soma+" minutos");
    sc.close();
    }
}
