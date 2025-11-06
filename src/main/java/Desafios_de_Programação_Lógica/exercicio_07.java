package Desafios_de_Programação_Lógica;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1, n2;
        do {
            System.out.println("Digite o primeiro número");
            n1 = sc.nextInt();
            System.out.println("Digite o segundo número");
            n2 = sc.nextInt();
            if (n1<n2){
                System.out.println("O primeiro número deve ser maior que o segundo número");
            }
        } while (n1<n2);

        int a=n1, b=n2, q=a/b, r=a%b;

        a=b*q+r;

        q=a/b;
        r=a%b;

        while (r!=0) {

            a=b;
            b=r;
            q=a/b;
            r=a%b;

            a=b*q+r;

        }
        System.out.println("O MDC de "+n1+" e "+n2+" é: "+b);
    }
}
