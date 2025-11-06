package Atv10_ListaFor;

import java.util.Random;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {

        Random rd=new Random();
        Scanner sc=new Scanner(System.in);
        boolean def;
        int soma=0;

        System.out.println("Presisone ENTER para iniciar o programa");
        sc.nextLine();

        for (int x=1; x<=200; x++) {
            def= rd.nextBoolean();
            if (def) {
                soma++;
            }

        }
        System.out.println("Total de peças defeituosas: "+soma);
        double por=(double) (soma*100)/200;

        System.out.println("Porcentagem de peças defeituosas: "+por+"%");
        sc.close();

    }
}
