package Atv08_EstruturaIfElse;

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite a quantidade de material na impressora 3d");
        int mat= sc.nextInt();

        if (mat>0){
            System.out.println("Impressão iniciada.");
        }
        else {
            System.out.println("Sem material disponível");
        }
    }
}
