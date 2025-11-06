package Atv08_EstruturaFor;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        for (int peca=1;peca<11;peca++) {
            System.out.println("Peça "+peca+" montada");
        }
    }
}
