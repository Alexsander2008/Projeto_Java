package Atv12C_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int hora, min;

        System.out.println("Digite uma quantidade de horas");
        hora=sc.nextInt();

        min=hora*60;

        System.out.println("Em "+hora+" horas, há um total de: "+min+" minutos");


    }
}
