package Atv08_EstruturaFor;

import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Aperte ENTER paar iniciar o programa");
        sc.nextLine();

        for (int equip=1;equip<11;equip++){
            System.out.println("Equipamento "+equip+" necessita de revisão");
        }
    }
}
