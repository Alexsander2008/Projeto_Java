package Atv08_EstruturaIfElse;

import java.util.Scanner;


public class exercicio_12 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int efic;

        System.out.println("Digite a eficiencia.");
        efic=sc.nextInt();

        if (efic>=85) {
            System.out.println("Eficiencia aceitável");
        }
        else System.out.println("Manutenção recomendada");
    }
}
