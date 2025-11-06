package Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int prodH;

        System.out.println("Digite a produção/hora");
        prodH=sc.nextInt();
        producao(prodH);
    }

    public static void producao (int linha) {

        if (linha<50) {
            System.out.println("baixo desempenho");
        }
        else if (linha>=50 && linha<=100) {
            System.out.println("desempenho regular");
        }
        else
            System.out.println("desempenho ótimo");
    }
}
