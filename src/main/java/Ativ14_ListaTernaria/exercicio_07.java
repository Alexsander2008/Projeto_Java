package Ativ14_ListaTernaria;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite o salário do funcionário");
        double sal= sc.nextDouble();

        double imp= (sal>5000) ? sal*0.2 : sal*0.1;
        System.out.printf("O imposto sobre o salário do funcionário será de: %.2f%n", imp);
        sc.close();
    }
}
