package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _5_Manutenção_Preventiva {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas horas de uso a máquina está ligada ?");
        int texto1 = sc.nextInt();
        if (texto1 < 500) {
            System.out.println("Consumo está baixo continue");
        } else if (texto1 > 500 && texto1 < 1000) {
            System.out.println("Consumo está médio, fique alerta");
        } else if (texto1 > 1000) {
            System.out.println("Desligue pois está em risco !!!");
        } else
            System.out.println("Digite uma opção válida !!!");
    }
}