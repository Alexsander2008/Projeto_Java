package Exemplos.Estrutura_de_Repeticao;

import java.util.Scanner;

public class _1_estruturaRepetitiva_while {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int x, soma;

        x= sc.nextInt();
        soma= 0;

        while (x!=0) {
            soma+= x;
            x= sc.nextInt();
        }

        System.out.println(soma);
        sc.close();
    }
}