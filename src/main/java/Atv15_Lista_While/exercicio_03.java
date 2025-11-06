package Atv15_Lista_While;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int horas = 0;
        int producao = 0;

        while (horas < 8) {
            producao += 50;
            horas++;
        }
        System.out.println("Produção total: " + producao + " Unidades");
        sc.close();
    }
}
