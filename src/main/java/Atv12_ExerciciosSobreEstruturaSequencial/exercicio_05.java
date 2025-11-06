package Atv12_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;
public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int cod1, cod2, num1, num2;
        double val1, val2;

        System.out.println("Escreva o código da peça 1");
        cod1= sc.nextInt();
        System.out.println("Escreva o código da peça 2");
        cod2= sc.nextInt();

        System.out.println("Digite a quantidade de será comprado da peça 1");
        num1= sc.nextInt();
        System.out.println("Digite a quantidade de será comprado da peça 2");
        num2= sc.nextInt();

        System.out.println("Digite o valor unitário da peça 1");
        val1= sc.nextDouble();
        System.out.println("Digite o valor unitário da peça 2");
        val2= sc.nextDouble();

        double resul1=(double) num1*val1;
        double resul2=(double) num2*val2;

        System.out.printf("O valor total a pagar é: R$ %.2f %n", (resul1+resul2));

        sc.close();
    }
}
