package Atv12_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;
public class exercicio_01 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int x;
        int y;

        System.out.println("Digite o primeiro número!");
        x=sc.nextInt();
        System.out.println("Digite o segundo número!");
        y=sc.nextInt();

        int soma=x+y;

        System.out.printf("O resultado da soma de "+x+" com o número "+y+" Tem como o resultado: "+soma);

        sc.close();
    }
}
