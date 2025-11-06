package Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int sens;

        do {
            System.out.println("Digite a distância até o obstáculo");
            sens=sc.nextInt();

            if (sens<0) {
                System.out.println("Digite uma resposta válida");
            }
        } while (sens<0);

        autonomo(sens);
        sc.close();

    }

    public static void autonomo (int m) {

        if (m<5) {
            System.out.println("Freie");
        }
        else if (m>=5 && m<=15) {
            System.out.println("Reduza a velocidade");
        }
        else
            System.out.println("Acelere");

    }
}
