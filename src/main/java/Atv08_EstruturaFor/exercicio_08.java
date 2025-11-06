package Atv08_EstruturaFor;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        for (int teste=1;teste<6;teste++){
            System.out.println("Executando teste "+teste);
        }
    }
}
