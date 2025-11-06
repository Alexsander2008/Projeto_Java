package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _19_Indústria_Química {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o PH: ");
        double PHinserido = sc.nextDouble();
        if (PHinserido < 7) {
            System.out.println("O PH esta ácido");
        } else if (PHinserido == 7) {
            System.out.println("O PH esta neutro");
        } else if (PHinserido > 7) {
            System.out.println("O PH está básico");
        }
    }
}
