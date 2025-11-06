package Atv12C_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double preco, desc;

        System.out.println("Digite o preço do produto");
        preco= sc.nextDouble();

        desc= preco*0.15;

        System.out.printf("O valor de R$%.2f com 15 porcento de desconto é: %n", preco);
        System.out.printf("R$%.2f%n", (preco+desc));
    }
}
