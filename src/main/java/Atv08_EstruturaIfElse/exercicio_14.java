package Atv08_EstruturaIfElse;

import java.util.Scanner;


public class exercicio_14 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int peca;

        System.out.println("Digite a quantidade de peças montadas");
        peca=sc.nextInt();

        if (peca!=0) {
            System.out.println("Montagem em andamento");
        }
        else System.out.println("Erro: verificar robô");
    }
}
