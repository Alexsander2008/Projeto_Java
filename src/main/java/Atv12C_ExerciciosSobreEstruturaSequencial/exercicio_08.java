package Atv12C_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double val;

        System.out.println("Digite o valor da compra");
        val= sc.nextDouble();

        System.out.printf("Parcelando em 3x o valor de cada parcela será: R$%.2f%n", (val/3));
    }
}
