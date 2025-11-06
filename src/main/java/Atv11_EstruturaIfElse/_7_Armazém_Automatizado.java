package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _7_Armazém_Automatizado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso do pacote: ");
        int texto1 = sc.nextInt();
        if (texto1 < 10) {
            System.out.println("O pacote está leve");
        } else if (texto1 > 10 && texto1 < 30) {
            System.out.println("O pacote está com peso médio");
        } else if (texto1 > 30 && texto1 < 60) {
            System.out.println("O pacote está com peso pesado");
        } else if (texto1 > 60) {
            System.out.println("O pacote está mega pesado");
        }
    }
}
