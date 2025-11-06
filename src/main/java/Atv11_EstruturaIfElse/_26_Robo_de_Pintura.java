package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _26_Robo_de_Pintura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a porcentagem de tinta: ");
        double tinta = sc.nextDouble();
        if (tinta <= 15) {
            System.out.println("Parar a produção");
        } else if (tinta >= 15 && tinta <= 50) {
            System.out.println("Alerta, reabastecer em breve");
        } else if (tinta >= 50) {
            System.out.println("Continuar produção");
        }
    }
}
