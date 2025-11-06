package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _1_Sistema_de_Robôs_Autônomos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual direção deseja que o robo ande?");
        String movimento = sc.nextLine();
        if (movimento.equalsIgnoreCase("Direita")) {
            System.out.println("O robo se movimentou para a Direita");
        } else if (movimento.equalsIgnoreCase("Esquerda")) {
            System.out.println("O robo se movimentou para a Esquerda");
        } else if (movimento.equalsIgnoreCase("Frontal")) {
            System.out.println("O robo andou para Frente");
        } else {
            System.out.println("Movimento não reconhecido");
        }
    }
}