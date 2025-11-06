package Atv12_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;
public class exercicio_03 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int a, b, c, d;

        System.out.println("Digite o primeiro valor");
        a= sc.nextInt();
        System.out.println("Digite o segundo valor");
        b= sc.nextInt();

        int prodab=a*b;
        System.out.println("O produto dos dois primeiros valores é um total de: "+prodab);

        System.out.println("Digite o terceiro valor");
        c= sc.nextInt();
        System.out.println("Digite o quarto valor");
        d= sc.nextInt();

        int prodcd=c*d;
        System.out.println("O produto dois últimos valores é um total de: "+prodcd);

        System.out.printf("A diferença do valor: "+prodab+" para o valor de "+prodcd+" é: "+(prodab-prodcd));

        sc.close();
    }
}
