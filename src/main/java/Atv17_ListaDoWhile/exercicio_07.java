package Atv17_ListaDoWhile;

import java.util.Scanner;

public class exercicio_07 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cons, soma=0, turnos=0;

        do {
            System.out.println("Digite o consumo do turno");
            cons = sc.nextInt();
            System.out.println("----------------------------------");
            soma+=cons;
            turnos++;

        } while (cons!=0);

        System.out.println("Consumo total: "+soma);
        System.out.println("Média do consumo dos turnos: "+(soma/turnos));
        sc.close();
    }
}
