package Atv17_ListaDoWhile;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int pecas=0, peso, soma=0;

        do {
            System.out.println("Digite o peso do lote em gramas");
            peso= sc.nextInt();
            soma+=peso;
            pecas++;
        } while (soma<500);

        System.out.println("Peças: "+pecas);
        System.out.println("Peso total: "+soma+"g");
        sc.close();
    }
}
