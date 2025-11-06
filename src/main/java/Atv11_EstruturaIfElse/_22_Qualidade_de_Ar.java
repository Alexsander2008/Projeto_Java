package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _22_Qualidade_de_Ar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o indice de particulas presentes no ar");
        int indice = sc.nextInt();
        if (indice < 50) {
            System.out.println("O indice está bom");
        } else if (indice >= 50 && indice <= 100) {
            System.out.println("O indice está ruim");
        } else if (indice >= 100 && indice <= 200) {
            System.out.println("O indice está ruim");
        } else if (indice > 200) {
            System.out.println("O indice está critico !!!");
        }
    }
}
