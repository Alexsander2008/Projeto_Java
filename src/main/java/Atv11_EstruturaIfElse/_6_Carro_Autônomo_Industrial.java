package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _6_Carro_Autônomo_Industrial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Iniciando o sendo... Qual a distância em metros do objeto?");
        int texto1 = sc.nextInt();
        if (texto1 < 5) {
            System.out.println("Freiar !");
        } else if (texto1 > 5 && texto1 < 15) {
            System.out.println("Reduza a velocidade");
        } else if (texto1 > 15) {
            System.out.println("Pode acelerar !");
        } else
            System.out.println("Digite uma opção valida");
    }
}
