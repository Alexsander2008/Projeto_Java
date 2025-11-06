package Atv15_Lista_While;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int peca = 0;

        while (peca < 100) {
            peca++;
            System.out.println("As peças produzidas foram: " + peca);
        }
        sc.close();
    }
}
