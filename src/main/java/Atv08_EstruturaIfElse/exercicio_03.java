package Atv08_EstruturaIfElse;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int robo;

        System.out.println("Digite a energia do robô pintor");
        robo=sc.nextInt();

        if (robo>=50) {
            System.out.println("Robô iniciando a pintura");
            sc.close();
        }
        else System.out.println("Energia suficiente, recarregar");
    }
}
