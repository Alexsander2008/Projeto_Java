package Atv08_EstruturaFor;

import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        for (int sensor=1;sensor<26;sensor++){
            System.out.println("Sensor IoT "+sensor+" sendo analisado");
        }
    }
}
