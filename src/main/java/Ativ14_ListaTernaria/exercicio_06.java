package Ativ14_ListaTernaria;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite a nota da prova");
        double nota= sc.nextDouble();

        String resul= (nota>=7) ? "Aluno aprovado" : "Aluno reprovado";
        System.out.println(resul);
        sc.close();
    }
}