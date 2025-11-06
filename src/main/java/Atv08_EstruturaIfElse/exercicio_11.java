package Atv08_EstruturaIfElse;

import java.util.Scanner;


public class exercicio_11 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String op;

        System.out.println("Há operadores na máquina?");
        op= sc.nextLine();

        if (op.equals("sim")) {
            System.out.println("Pausar linha de produção");
        }
        else System.out.println("Linha operando normalmente");
    }

}
