package Atv17_ListaDoWhile;

import java.util.Scanner;

public class exercicio_14 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resp;
        int DO1=0, DO2=0, DO3=0;

        do{
            System.out.println("Digite o código de defeito ('DO1', 'DO2' ou 'DO3') ou digite 'sair' para sair");
            resp = sc.nextLine();

            if (resp.equalsIgnoreCase("DO1")){
                DO1++;
            } else if (resp.equalsIgnoreCase("DO2")){
                DO2++;
            } else if (resp.equalsIgnoreCase("DO3")){
                DO3++;
            }
        } while (!resp.equalsIgnoreCase("sair"));

        System.out.println("=================================");
        System.out.println("Log de erros:");
        System.out.println("DO1: "+DO1);
        System.out.println("DO2: "+DO2);
        System.out.println("DO3: "+DO3);
        System.out.println("=================================");
        sc.close();
    }
}
