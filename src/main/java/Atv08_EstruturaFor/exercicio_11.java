package Atv08_EstruturaFor;

import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        for (int etapa=1;etapa>16;etapa++) {
            System.out.println("Etapa da esteira verificada: "+etapa);
        }
    }
}
