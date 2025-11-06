package Exercicios_Condição_termal;

import java.util.Scanner;

public class Exercicio_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantas horas você trabalhou");
        double h = sc.nextDouble();
        System.out.println("Digite quanto você ganha por hora");
        double v = sc.nextDouble();
        double salario = h*v;
        String total = (salario<2000) ? "Salario ruim" : "Salario bom";
        System.out.println(total);
    }
}
