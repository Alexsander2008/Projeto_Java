package Atv08_EstruturaIfElse;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite o toal de produção do turno");
        int prod= sc.nextInt();

        if (prod>=1000){
            System.out.println("Meta atingida!");
        }
        else {
            System.out.println("Produção abaixo da meta!");
        }
    }
}
