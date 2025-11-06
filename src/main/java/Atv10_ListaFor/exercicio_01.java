package Atv10_ListaFor;

import java.util.Random;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {

        Random rd=new Random();
        Scanner sc=new Scanner(System.in);

        System.out.println("Pressione ENTER para iniciar o programa");
        sc.nextLine();

        int resul=0;

        for (int maq=1; maq<=100; maq++) {

            int x=rd.nextInt(101);

            System.out.println("A máquina "+maq+" Teve a eficiencia de: "+x);

            resul+=x;
        }
        System.out.println("A média de eficiência das máquinas é: "+resul/100);
        sc.close();

    }
}
