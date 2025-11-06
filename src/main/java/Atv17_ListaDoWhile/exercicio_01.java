package Atv17_ListaDoWhile;

import java.util.Random;
import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int temp;

        System.out.println("digite a leitura de temperatura do forno industrial");
        temp= sc.nextInt();
        do {
            System.out.println("Digite a proxima leitura");
            temp= sc.nextInt();

        } while (temp<800 || temp>1200);

        System.out.println("Temperatura válida: "+temp);
        sc.close();
    }
}
