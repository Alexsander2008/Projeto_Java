package main.java.Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_16 {
    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);

        String def;

        System.out.println("Digite a situacao do defeito da peca");
        def=sc.nextLine();

        peca(def);


    }
    public static void peca (String defeito) {

        if (defeito.equalsIgnoreCase("visivel")) {
            System.out.println("O defeito e de nivel alto");
        }
        else if (defeito.equalsIgnoreCase("microscopio")) {
            System.out.println("O defeito e de nivel medio");
        }
        else
            System.out.println("O defeito e de nivel baixo");
    }
}
