package Atv12C_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double dep, jur, rend;

        System.out.println("Digite o valor do depósito");
        dep= sc.nextDouble();

        System.out.println("Digite a % da taxa de juros mensais");
        jur= sc.nextDouble();

        rend= (dep*(jur/100));

        System.out.printf("O rendimento no primeiro mês será de: R$%.2f%n", rend);
        System.out.printf("O valor total após um mês será de: R$%.2f%n", (rend+dep));
    }
}
