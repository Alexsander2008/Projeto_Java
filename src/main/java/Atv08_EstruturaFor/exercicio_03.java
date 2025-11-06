package Atv08_EstruturaFor;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        for (int cam=1;cam<8;cam++) {
            System.out.println("Imprimindo camada: "+cam);
        }
    }
}
