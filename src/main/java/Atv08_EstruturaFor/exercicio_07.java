package Atv08_EstruturaFor;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        for (int caixa=1; caixa<13; caixa++){
            System.out.println("Caixa "+caixa+" armazenada");
        }
    }
}
