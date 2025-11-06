package Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String cond1,cond2,cond3;

        System.out.println("O cracha esta valido?");
        cond1=sc.nextLine();

        System.out.println("O capacete de segurança está correto?");
        cond2=sc.nextLine();

        System.out.println("O horário de turno está correto?");
        cond3=sc.nextLine();
        reconhecimento(cond1,cond2,cond3);
    }
    public static void reconhecimento (String cond01, String cond02, String cond03) {

        if (cond01.equalsIgnoreCase("sim") && cond02.equalsIgnoreCase("sim") && cond03.equalsIgnoreCase("sim")) {
            System.out.println("Acesso liberado");
        }
        else
            System.out.println("Acesso negado");
    }
}


