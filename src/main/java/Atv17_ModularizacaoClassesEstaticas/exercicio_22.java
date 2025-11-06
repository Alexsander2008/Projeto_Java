package main.java.Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int qual;

        System.out.println("Digite a quantidade de particulas");
        qual=sc.nextInt();

        System.out.println(qualidade(qual));

    }
    public static String qualidade (int ar) {

        String qualidade;

        if (ar<=50) {
            qualidade="esta em um estado bom";
        }
        else if (ar<=100) {
            qualidade="esta em um estado ruim";
        }
        else
            qualidade="esta em um estado critico";

        return qualidade;
    }
}
