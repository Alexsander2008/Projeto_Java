package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _17_Produção_com_Robôs {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja acionar o robo A ?");
        String opcao = sc.nextLine();
        if (opcao.equals("sim")) {
            System.out.println("o robo falhou");
            System.out.println("O robo B foi acionado");
        }
    }
}
