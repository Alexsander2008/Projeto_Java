package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _20_Fábrica_4_0 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o horario atual para saber o turno (00:00)");
        double horario = sc.nextDouble();
        if (horario < 12) {
            System.out.println("O seu turno é de manhã");
        } else if (horario >= 12 && horario <= 18) {
            System.out.println("Seu turno é de tarde");
        } else if (horario >= 18 && horario <= 24) {
            System.out.println("Seu turno é noturno");
        }
    }
}
