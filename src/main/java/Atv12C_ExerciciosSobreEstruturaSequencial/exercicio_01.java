package Atv12C_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int ano, dia, bi;

        System.out.println("Quantos anos você tem?");
        ano=sc.nextInt();

        dia=365*ano;

        System.out.println("Voce viveu o total de: "+dia);



    }
}
