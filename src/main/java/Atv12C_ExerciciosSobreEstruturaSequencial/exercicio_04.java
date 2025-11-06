package Atv12C_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double n1, n2, media;

        System.out.println("Digite o primeiro número");
        n1= sc.nextDouble();

        System.out.println("Digite o segundo número");
        n2= sc.nextDouble();

        media= (n1*3+n2*2)/(3+2);

        System.out.println("A média ponderada de "+n1+" e "+n2+" é: "+media);
    }
}
