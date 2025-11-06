package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _21_Veículos_Industriais {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a carga do veiculo");
        double carga = sc.nextDouble();
        if (carga <= 500) {
            System.out.println("Quantidade permitida");
        } else if (carga >= 500 && carga <= 1000) {
            System.out.println("Alerta de peso !!!");
        } else if (carga >= 1000) {
            System.out.println("Peso proibido !!!");
        }
    }
}
