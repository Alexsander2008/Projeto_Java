package Treino;

import java.util.Scanner;

public class tabuadaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero que deseja saber a tabuada");
        int y = 1;


        for (int x=sc.nextInt(); y <= 9; y++) {
            int z=x*y;
            System.out.println(z);


        }
    }
}