package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _27_Produção_Automatizada_Avançada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual erro apareceu no sistema agora ?");
        System.out.println("Crítico");
        System.out.println("Moderado");
        String nome = sc.nextLine();
        if (nome.equalsIgnoreCase("Critico")) {
            System.out.println("A linha irá ser parada imediatamente");
        } else if (nome.equalsIgnoreCase("Moderado")) {
            System.out.println("Iremos fazer uma manutenção imediatamente");
        } else
            System.out.println("A produção irá continuar");
    }
}
