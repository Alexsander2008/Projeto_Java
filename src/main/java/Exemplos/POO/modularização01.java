package Exemplos.POO;

import java.util.Scanner;

public class modularização01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a, b,c;

        System.out.println("Digite três números:");
        System.out.println("Primeiro:");
        a= sc.nextInt();
        System.out.println("Segundo:");
        b= sc.nextInt();
        System.out.println("Terceiro:");
        c= sc.nextInt();

        int maisAlto= max(a, b, c);

        resultado(maisAlto);

        sc.close();
    }

    public static int max (int x, int y, int z) {
        int aux;
        if (x>y && x>z) {
            aux=x;
        } else if (y>x && y>z) {
            aux=y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void resultado (int valor) {
        System.out.println("Número mais alto: "+valor);
    }
}
