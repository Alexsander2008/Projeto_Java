package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _3_Sistema_de_Energia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quala porcentagem da energia da maquina ?");
        int texto1 = sc.nextInt();
        if (texto1 < 70 && texto1 > 30) {
            System.out.println("Está no modo normal");
        } else if (texto1 > 70 && texto1 < 100) {
            System.out.println("Modo turbo ativando...");
        } else
            System.out.println("Digite um número valido !!!");
    }
}
