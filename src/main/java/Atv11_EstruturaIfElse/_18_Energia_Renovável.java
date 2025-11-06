package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _18_Energia_Renovável {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quanto há de energia solar disponivel: ");
        double energia = sc.nextDouble();
        if (energia > 70) {
            System.out.println("A energia foi solar disponivel");
        } else if (energia >= 30 && energia <= 70) {
            System.out.println("Usar energia solar e eletrica");
        } else if (energia < 30) ;
        System.out.println("Usar rede eletrica");
    }
}
