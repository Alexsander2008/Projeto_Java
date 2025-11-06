package Atv12B_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int dias, horas;

        System.out.println("Digite a quantidade de dias para converter para horas.");
        dias=sc.nextInt();

        horas= dias*24;

        System.out.println(dias+" dia(s) = "+horas+" horas");
    }
}
