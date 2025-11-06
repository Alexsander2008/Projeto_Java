package Desafios_de_Programação_Lógica;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val, nota200=0, nota100=0, nota50=0, nota20=0, nota10=0, nota5=0, nota2=0, moeda1=0;

        System.out.println("Digite o valor que deseja sacar:");
        val= sc.nextInt();

        System.out.println("Sacando R$"+val+",00...");
        while (val>=200) {
            nota200+=1;
            val-=200;
        }
        while (val>=100) {
            nota100+=1;
            val-=100;
        }
        while (val>=50) {
            nota50+=1;
            val-=50;
        }
        while (val>=20) {
            nota20+=1;
            val-=20;
        }
        while (val>=10) {
            nota10+= 1;
            val-=10;
        }
        while (val>=5) {
            nota5+= 1;
            val-=5;
        }
        while (val>=2) {
            nota2+= 1;
            val-=2;
        }
        while (val>0) {
            moeda1+=1;
            val-=1;
        }
        if (nota200!=0){
            System.out.println(nota200+" notas de 200");
        }
        if (nota100!=0) {
            System.out.println(nota100 + " notas de 100");
        }
        if (nota50!=0) {
            System.out.println(nota50 + " notas de 50");
        }
        if (nota20!=0) {
            System.out.println(nota20 + " notas de 20");
        }
        if (nota10!=0) {
            System.out.println(nota10 + " notas de 10");
        }
        if (nota5!=0) {
            System.out.println(nota5 + " notas de 5");
        }
        if (nota2!=0) {
            System.out.println(nota2 + " notas de 2");
        }
        if(moeda1!=0) {
            System.out.println(moeda1 + " moedas de 1");
        }
        sc.close();
    }
}
