package Exercicios_Condição_termal;

import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota do aluno");
        double n1 = sc.nextDouble();
        String prova = (n1<7) ? "Reprovou" : "Aprovou";
        System.out.println("O aluno "+prova);
    }
}
