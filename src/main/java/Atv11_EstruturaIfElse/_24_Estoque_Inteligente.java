package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _24_Estoque_Inteligente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a quantidade no estoque");
        int estoque = sc.nextInt();
        if (estoque <= 10) {
            System.out.println("Abastecer o estoque agora !");
        } else if (estoque >= 10 && estoque <= 30) {
            System.out.println("Alerta, se prepare para abastecer");
        } else if (estoque >= 30) {
            System.out.println("O estoque está normal");
        }
    }
}
