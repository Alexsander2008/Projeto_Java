package Atv15_Lista_While;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int estoque = 500;
        int retirada = 20;
        int contador = 0;

        System.out.println("Iniciando monitoramento do estoque: ");

        while (estoque >= 100) {
            contador++;
            System.out.println(" Retirada n° "+contador+ " : " +retirada+" Unidades removidas");
            estoque -= retirada;
            System.out.println(" Estoque atual: "+estoque+ " Unidades ");
        }
        System.out.println(" O estoque de unidades é: " + estoque);
        sc.close();
    }
}
