package Atv08_EstruturaIfElse;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite o número de defeitos do lote");
        int def= sc.nextInt();

        if (def>5){
            System.out.println("Lote reprovado");
        }
        else{
            System.out.println("Lote aprovado");
        }
    }
}
