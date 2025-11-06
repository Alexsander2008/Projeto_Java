package Atv12B_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int anos, dias;

        System.out.println("Digite quantos anos você quer converter em dias:");
        anos= sc.nextInt();

        dias= anos*365;

        System.out.println(anos+ " anos são "+dias+" dias.");
    }
}
