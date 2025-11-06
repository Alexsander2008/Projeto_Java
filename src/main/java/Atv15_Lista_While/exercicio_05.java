package Atv15_Lista_While;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int pressao = 0;

        while (pressao < 120) {
            pressao++;
            System.out.println("A pressão atingida foi: " + pressao);
        }
        sc.close();
    }
}
