package Exercicios_Condição_termal;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota do aluno");
        double n = sc.nextInt();
        String nota = (n<7) ? "REPROVADO" : "APROVADO";
        System.out.println("O aluno foi "+nota);
    }
}
