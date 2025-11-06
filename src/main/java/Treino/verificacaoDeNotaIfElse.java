package Treino;

import java.util.Scanner;

public class verificacaoDeNotaIfElse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int nota;
        String nome;

        System.out.println("Digite o nome do aluno");
        nome= sc.nextLine();

        System.out.println("Digite a nota do aluno");
        nota= sc.nextInt();

        if (nota>=85) {
            System.out.printf("O(a) aluno(a) "+nome+" passou de ano e esta convocado(a) para obmep com a nota total de: "+nota);
        }
        else if (nota>=60) {
            System.out.println("O(a) aluno(a) "+nome+" passou de ano, com a nota total de: "+nota);
        }
        else if (nota>=40) {
            System.out.println("O(a) aluno(a) "+nome+" tera que fazer a recuperação final, com a nota final de: "+nota);
        }
        else {
            System.out.println("O(a) aluno(a) "+nome+" reprovou de ano direto, com a nota total de: "+nota);
        }

    }



}
