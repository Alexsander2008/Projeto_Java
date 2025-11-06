package main.java.Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int prod;

        System.out.println("Digite quantos produtos tem no estoque");
        prod=sc.nextInt();

        System.out.println(estoque(prod));
    }
    public static String estoque (int produto) {

        String estoque;

        if (produto<=10) {
            estoque="reabastecer imediatamente";
        }
        else if (produto<=30) {
            estoque="Ficar em alerta";
        }
        else
            estoque="normal";

        return estoque;
    }
}
