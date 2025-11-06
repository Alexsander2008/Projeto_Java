package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _8_Impressora_3D_ {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Em qual % o material se localiza ?");
        int texto1 = sc.nextInt();
        if (texto1 < 20) {
            System.out.println("Deve trocar o material");
        } else
            System.out.println("Pode continuar, fique atento a % (porcentagem)");
    }
}
