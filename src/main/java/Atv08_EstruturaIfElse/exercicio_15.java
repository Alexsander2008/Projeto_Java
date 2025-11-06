package Atv08_EstruturaIfElse;

import java.util.Scanner;


public class exercicio_15 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int qual;

        System.out.println("Digite a porcentagem de peças aprovadas");
        qual=sc.nextInt();

        if (qual<90) {
            System.out.println("Qualidade abaixo do padrao");
        }
        else System.out.println("Qualidade aceitável");
    }
}
