package Desafios_de_Programação_Lógica;

import java.util.Scanner;

public class exercicio_08 {
    // Converter decimal para binário
    public static void ConversaoBinario () {
        Scanner sc= new Scanner(System.in);
        int n;
        String binInv= "", bin= "";

        System.out.println("Digite o número para converter para binário");
        n=sc.nextInt();

        if (n==0){
            System.out.println("0");
        }
        while (n>0){
            binInv+= n%2;
            n= n/2;
        }
        for (int i= binInv.length()-1; i>=0; i--) {
            bin+= binInv.charAt(i);
        }
        System.out.println(bin);
    }

    // Converter binário para decimal
    public static void ConversaoDecimal () {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite o binário para converter para decimal");
        String bin= sc.nextLine();

        int decimal=0, potencia=0;
        char bit;
        for (int i= bin.length()-1; i>=0; i--) {
            bit= bin.charAt(i);
            if (bit=='1'){
                decimal+= Math.pow(2,potencia);
            }
            potencia+=1;
        }
        System.out.println(decimal);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int opcao;
        char resp;

        do {
            do {
                System.out.println("Selecione o que deseja fazer:");
                System.out.println("1- Converter um número decimal para binário");
                System.out.println("2- Converter um binário para número decimal");
                opcao = sc.nextInt();

                if (opcao != 1 && opcao != 2) {
                    System.out.println("Digite apenas 1 ou 2");
                }

            } while (opcao != 1 && opcao != 2);

            if (opcao == 1) {
                exercicio_08.ConversaoBinario();
            }
            else if (opcao == 2) {
                exercicio_08.ConversaoDecimal();
            }

            System.out.println("Deseja sair? s/n");
            resp= sc.next().charAt(0);
        } while (resp!='s');
        sc.close();
    }
}