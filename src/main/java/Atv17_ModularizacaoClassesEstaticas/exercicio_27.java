package main.java.Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String erro;

        System.out.println("Digite o estado do erro");
        erro=sc.nextLine();

        producao(erro);

    }
    public static void producao (String erro1) {

        if (erro1.equalsIgnoreCase("critico")) {
            System.out.println("parar linha de producao");
        }
        else if (erro1.equalsIgnoreCase("moderado")) {
            System.out.println("Acionar manutencao");
        }
        else
            System.out.println("continuar producao");
    }
}
