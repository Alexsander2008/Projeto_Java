package Ativ14_ListaTernaria;

import java.util.Scanner;

public class exercicio_18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro");
        int n1= sc.nextInt();
        System.out.println("Digite o segundo número inteiro");
        int n2= sc.nextInt();

        String resul= (n1>n2) ? n1+" é maior" : n2+" é maior";
        System.out.println(resul);
        sc.close();
    }
}