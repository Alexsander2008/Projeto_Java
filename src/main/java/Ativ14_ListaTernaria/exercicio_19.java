package Ativ14_ListaTernaria;

import java.util.Scanner;

public class exercicio_19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite o número de horas trabalhadas pelo empregado");
        int h = sc.nextInt();
        System.out.println("Digite o valor que o empregado recebe por hora");
        double val= sc.nextDouble();

        double salario= ((double) val*h);

        String resul = (salario>2000) ? "O salário do empregado é bom" : "O salário do empregado é ruim";
        System.out.println(resul);

        sc.close();
    }
}