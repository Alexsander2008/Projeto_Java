package main.java.Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int temp;

        System.out.println("Digite a temperatura da maquina");
        temp=sc.nextInt();

        maquina(temp);

    }
    public static void maquina (int temrs) {

        if (temrs>81) {
            System.out.println("Vibracao de emergencia acionada");
        }
        else
            System.out.println("Maquina desligada em emergencia");
    }
}
