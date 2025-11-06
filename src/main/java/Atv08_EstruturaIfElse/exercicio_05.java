package Atv08_EstruturaIfElse;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite a velocidade do carro em km/h");
        int vel= sc.nextInt();

        if (vel>120) {
            System.out.println("Reduzir a velocidade imediatamente!");
        }
        else {
            System.out.println("Velocidade dentro do limite.");
        }
    }
}
