package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _4_Controle_de_Acesso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Qual seu tipo de acesso ?");
        System.out.println("Básico");
        System.out.println("Supervisor");
        System.out.println("Engenheiro");
        String texto1 = sc.nextLine();
        if (texto1.equalsIgnoreCase("Básico")) {
            System.out.println("Acesso negado");
        } else if (texto1.equalsIgnoreCase("Supervisor")) {
            System.out.println("Acesso parcial concedido ao sistema");
        } else if (texto1.equalsIgnoreCase("Engenheiro")) {
            System.out.println("Acesso Total ao sistema");
        } else
            System.out.println("Digite uma opção válida !!!");
        sc.close();
    }
}
