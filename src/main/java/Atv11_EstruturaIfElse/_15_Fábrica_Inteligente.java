package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _15_Fábrica_Inteligente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a vibração da maquina para saber o protocolo");
        int vibracao = sc.nextInt();
        System.out.println("Digite a temperatura da maquina para saber o protocolo");
        int temp = sc.nextInt();
        if (vibracao >= 80 && temp >= 90) {
            System.out.println("A maquina deve ser desligada !!!");
        } else if (vibracao <= 80 && temp >= 90) {
            System.out.println("A vibração está okay, fique atento a temperatura");
        } else if (vibracao >= 80 && temp <= 90) {
            System.out.println("A temperatura está okay, fique atento a vibração");
        }
    }
}
