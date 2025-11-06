package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _25_Sistema_de_Soldagem {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da intensidade eletrica: ");
        int intensidade = sc.nextInt();
        if (intensidade < 100) {
            System.out.println("A intensidade deve ser maior que 100A");
        } else if (intensidade >= 100 && intensidade <= 200) {
            System.out.println("A intensidade está mediana");
        } else if (intensidade >= 200) {
            System.out.println("A intensidade está forte");
        }
    }
}
