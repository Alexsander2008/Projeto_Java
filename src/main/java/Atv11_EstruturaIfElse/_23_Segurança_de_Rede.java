package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _23_Segurança_de_Rede {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o trafego escaneado");
        int escaneado = input.nextInt();
        if (escaneado > 70) {
            System.out.println("O trafego está bloqueado");
        } else if (escaneado >= 30 && escaneado <= 70) {
            System.out.println("O trafego está suspeito");
        } else if (escaneado < 30) {
            System.out.println("O trafego está normal");
        }
    }
}
