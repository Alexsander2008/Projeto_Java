package Atv08_EstruturaIfElse;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite a temperatura da máquina:");
        int temp= sc.nextInt();

        if (temp>80){
            System.out.println("Máquina desligada por super aquecimento!");
        }
        else{
            System.out.println("Máquina operando normalmente!");
        }
    }
}
