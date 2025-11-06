package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _12_Segurança_Industrial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Você está com o crachá?");
        String confirmacao1 = sc.nextLine();
        if (confirmacao1.equalsIgnoreCase("sim")) {
            System.out.println("Você está com o capacete?");
            String confirmacao2 = sc.nextLine();
            if (confirmacao2.equalsIgnoreCase("sim")) {
                System.out.println("Está dentro do hórario do seu turno?");
                String confirmacao3 = sc.nextLine();
                if (confirmacao3.equalsIgnoreCase("sim")) {
                    System.out.println("Tudo certo então !!! Prossiga para sua área,Otimo trabalho :)");
                } else if (confirmacao3.equalsIgnoreCase("nao")) {
                    System.out.println("Lamentamos mas não podemos continuar com seu acesso \nSó ira ter acesso caso obtenha o requisito");
                }
            } else if (confirmacao2.equalsIgnoreCase("nao")) {
                System.out.println("Lamentamos mas não podemos continuar com seu acesso \nSó ira ter acesso caso obtenha o requisito");
            }
        } else if (confirmacao1.equalsIgnoreCase("nao")) {
            System.out.println("Lamentamos mas não podemos continuar com seu acesso \nSó ira ter acesso caso obtenha o requisito");
        }
    }
}
