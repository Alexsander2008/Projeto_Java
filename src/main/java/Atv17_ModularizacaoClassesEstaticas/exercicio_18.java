package main.java.Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int ener;

        System.out.println("Digite a energia solar disponivel");
        ener=sc.nextInt();

        sol(ener);


    }
    public static void sol (int n) {

        if (n>=70) {
            System.out.println("Use energia solar");
        }
        else if (n>=30) {
            System.out.println("Use energia hibrida");
        }
        else
            System.out.println("usar rede eletrica");
    }
}
