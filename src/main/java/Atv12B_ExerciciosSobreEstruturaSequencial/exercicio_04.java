package Atv12B_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double base, altura;

        System.out.println("Digite a base do triângulo.");
        base= sc.nextDouble();

        System.out.println("Digite a altura do triângulo.");
        altura= sc.nextDouble();

        System.out.println("A área do triângulo é: "+ (base*altura)/2);
    }
}
