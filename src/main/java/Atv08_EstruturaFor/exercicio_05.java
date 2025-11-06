package Atv08_EstruturaFor;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Aperte ENTER para inciar o programa");
        sc.nextLine();

        for (int robo=1;robo<10;robo++) {
            System.out.println("Inspecionando robo "+robo);
        }
    }
}
