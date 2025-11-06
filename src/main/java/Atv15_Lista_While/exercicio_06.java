package Atv15_Lista_While;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int tempo = 60, peca = 1;

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        while (peca <= 10) {
            System.out.println("Peça " + peca);

            while (tempo >= 0) {
                System.out.println("Tempo de produção " + tempo + " segundos");
                tempo -= 10;
            }

            peca++;
            tempo = 60;
            System.out.println("-------------------------------");
        }

        sc.close();
    }
}
