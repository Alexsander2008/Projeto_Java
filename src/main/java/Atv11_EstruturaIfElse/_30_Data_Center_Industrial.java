package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _30_Data_Center_Industrial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");
        float temperatura = sc.nextFloat();
        if (temperatura >= 80) {
            System.out.println("Desligue os servidores");
        } else if (temperatura >= 60 && temperatura <= 80) {
            System.out.println("Resfriamente extra");
        } else if (temperatura <= 60) {
            System.out.println("Temperatura estavel");
        }
    }
}
