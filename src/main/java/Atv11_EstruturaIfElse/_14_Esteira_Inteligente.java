package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _14_Esteira_Inteligente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número para ser colocado na esteira ?");
        int n1 = sc.nextInt();
        if (n1 < 30){
            System.out.println("Velocidade colocada no modo: Lento");
        } else if (n1 > 30 && n1 < 60) {
            System.out.println("Velocidade colocada no modo: Médio");
        } else if (n1 > 60 && n1 < 90) {
            System.out.println("Velocidade colocada no modo: Rápido");
        } else if (n1 > 90) {
            System.out.println("Velocidade muito alta para ser suportada");
        }
    }
}
