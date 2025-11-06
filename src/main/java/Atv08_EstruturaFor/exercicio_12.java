package Atv08_EstruturaFor;

import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        for (int robo=1;robo<7;robo++) {
            System.out.println("Status do robo: "+robo);
        }
    }
}
