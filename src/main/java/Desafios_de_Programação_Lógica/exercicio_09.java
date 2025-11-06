package Desafios_de_Programação_Lógica;

import java.util.Scanner;

public class exercicio_09 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n, div=2, expoente=0;

        System.out.println("Digite um número para saber seus fatores primos");
        n= sc.nextInt();

        System.out.println("Os fatores primos de "+n+" são:");
        while (n>1) {
            Boolean primo=true;
            // verifica primo
            for (int i=2; i<div; i++) {
                if (div%i==0) {
                    primo = false;
                    break;
                }
            }
            //verifica a quantidade de vezes do divisor
            if (primo) {
                expoente=0;
                while (n%div==0) {
                    n=n/div;
                    expoente++;
                }
                if (expoente>0) {
                    System.out.println(div + "^" + expoente);
                }
            }
            div++;
        }
        sc.close();
    }
}
