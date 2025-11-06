package Atv12_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        float a, b, c;

        System.out.println("Digite o primeiro valor");
        a= sc.nextFloat();

        System.out.println("Digite o segundo valor");
        b= sc.nextFloat();

        System.out.println("Digite o terceiro valor");
        c= sc.nextFloat();

        float areaTri=(a*c)/2;
        float areaCir=(float)((double)3.14159*Math.pow(c,2));
        float areaTra=(a+b)*c/2;
        float areaQua=b*b;
        float areaRe=a*b;

        System.out.printf("A área do triângulo é: %.3f%n",areaTri);
        System.out.printf("A área do circulo é: %.3f%n",areaCir);
        System.out.printf("A área do trapézio é: %.3f%n",areaTra);
        System.out.printf("A área do quadrado é: %.3f%n",areaQua);
        System.out.printf("A área do retângulo é: %.3f%n",areaRe);

        sc.close();
    }
}
