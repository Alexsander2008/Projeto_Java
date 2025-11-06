package main.java.Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String estrada;

        System.out.println("Digite a situacao da estrada");
        estrada=sc.nextLine();

        rua(estrada);

    }
    public static void rua (String rota) {

        if (rota.equalsIgnoreCase("bloqueada")) {
            System.out.println("Recalcular rota");
        }
        else if (rota.equalsIgnoreCase("transito alto")) {
            System.out.println("Rota alternativa");
        }
        else
            System.out.println("Sehuir normalmente");
    }
}
