package Atv08_EstruturaFor;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        for (int h=1; h<=6; h++){
            System.out.println("Hora "+h+" do turno");
        }
    }
}
