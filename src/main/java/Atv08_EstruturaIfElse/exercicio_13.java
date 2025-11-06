package Atv08_EstruturaIfElse;

import java.util.Scanner;


public class exercicio_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ener;

        System.out.println("Digite a energia captada");
        ener = sc.nextInt();

        if (ener > 200) {
            System.out.println("Acionar a energia auxiliar");
        } else System.out.println("Energia solar insuficiente");
    }
}
