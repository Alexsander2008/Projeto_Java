package Atv08_EstruturaIfElse;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int estoque;

        System.out.println("Digite a quantidade de produtos em estoque");
        estoque=sc.nextInt();

        if (estoque<20) {
            System.out.println("Estoque insuficiente, reabastecer imediatamente!");
            sc.close();
        }
        else System.out.println("Estoque suficiente");
    }
}
