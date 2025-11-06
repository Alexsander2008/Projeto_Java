package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _28_Transporte_Autônomo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Como está a situação da estrada ?");
        System.out.println("Bloqueada");
        System.out.println("Transito");
        String rotas = sc.nextLine();
        if (rotas.equalsIgnoreCase("bloqueada")) {
            System.out.println("Recalculando rota");
        } else if (rotas.equalsIgnoreCase("transito")) {
            System.out.println("Colocando rota alternativa");
        } else
            System.out.println("Prossiga com a rota");
    }
}
