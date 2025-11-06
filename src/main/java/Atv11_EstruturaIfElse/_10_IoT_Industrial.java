package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _10_IoT_Industrial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo(a) ao sistema de temperatura\n Digite a temperatura que se encontra na maquina");
        int temp = sc.nextInt();
        if (temp < 0){
            System.out.println("Alerta de congelamento");
        }else if (temp > 0 && temp < 40){
            System.out.println("Temperatura normal");
        } else if (temp > 40) {
            System.out.println("Alerta de SUPERAQUECIMENTO !!!");
        }
    }
}
