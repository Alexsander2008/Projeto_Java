package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _29_Inspeção_Final {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de defeitos: ");
        int defeito = sc.nextInt();
        if (defeito > 20) {
            System.out.println("Reprovado");
        } else if (defeito >= 10 && defeito <= 20) {
            System.out.println("Retrabalho");
        } else if (defeito < 10) {
            System.out.println("Aprovado");
        }
    }
}
