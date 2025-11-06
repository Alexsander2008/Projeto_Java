package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _11_Drones_na_Indústria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nivel da bateria que se encontra ?");
        int bat = sc.nextInt();
        if (bat < 20){
            System.out.println("Retorne imediatamento");
        } else if (bat > 20 && bat < 60) {
            System.out.println("Rota muito curto");
        } else if (bat > 60) {
            System.out.println("Rota longa");
        }
    }
}
