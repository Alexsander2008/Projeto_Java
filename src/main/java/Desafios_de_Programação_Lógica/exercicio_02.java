package Desafios_de_Programação_Lógica;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char resposta;

        do {
            System.out.println("Digite um número inteiro até 399 para converter para romanos");
            int n = sc.nextInt();
            String romano = "";

            if (n > 399) {
                do {
                    System.out.println("Digite um valor válido");
                    n = sc.nextInt();
                } while (n < 0 || n > 399);
            }

            while (n >= 100) {
                romano += "C";
                n -= 100;
            }
            if (n >= 90) {
                romano += "XC";
                n -= 90;
            }
            while (n >= 50 && n < 90) {
                romano += "L";
                n -= 50;
            }
            if (n >= 40) {
                romano += "XL";
                n -= 40;
            }
            while (n >= 10 && n < 40) {
                romano += "X";
                n -= 10;
            }
            if (n >= 9) {
                romano += "IX";
                n -= 9;
            } else if (n >= 5) {
                romano += "V";
                n -= 5;
            } else if (n >= 4) {
                romano += "IV";
                n -= 4;
            }
            while (n >= 1 && n < 4) {
                romano += "I";
                n -= 1;
            }
            System.out.println(romano);
            System.out.println("Deseja tentar novamente? s/n");
            resposta =  sc.next().charAt(0);

        } while (resposta!= 'n');

        sc.close();
    }
}
