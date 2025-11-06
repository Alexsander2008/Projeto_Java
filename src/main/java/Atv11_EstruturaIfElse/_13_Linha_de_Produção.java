package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _13_Linha_de_Produção {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto você fez por produção ?");
        int prod = sc.nextInt();
        if (prod < 50) {
            System.out.println("Está abaixo do desempenho aumente !");
        } else if (prod > 50 && prod < 100) {
            System.out.println("O desempenho está regular, mas da para melhorar !");
        } else if (prod > 100) {
            System.out.println("O desempenho está ótimo !! MANTENHA !!");
        }

    }
}
