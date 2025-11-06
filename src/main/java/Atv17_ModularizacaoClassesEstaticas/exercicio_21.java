package main.java.Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int carga;

        System.out.println("Digite a carga do veiculo");
        carga=sc.nextInt();

        System.out.println(veiculo(carga));

    }
    public static String veiculo (int peso) {
        String veiculo;

        if (peso<500) {
            veiculo="Veiculo permitido";
        }
        else if (peso<1000) {
            veiculo="veiculo em alerta";
        }
        else
            veiculo="veiculo proibido";

        return veiculo;
    }
}
