package Atv17_ListaDoWhile;

import java.util.Scanner;

// MES: O Sistema MES é um software de gestão que monitora a produção industrial em tempo real, integrando o chão de fábrica com sistemas de planejamento

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int opcao;

        System.out.println("Bem vindo ao painel MES");
        do {
            System.out.println("---------------------------------------------------");
            System.out.println("Digite a opção que gostaria de realizar");
            System.out.println("1. Registrar parada");
            System.out.println("2. Registrar produção");
            System.out.println("3. Sair");
            System.out.println("---------------------------------------------------");
            opcao= sc.nextInt();

            if (opcao==1){
                System.out.println("Parada registrada");
            } else if (opcao==2) {
                System.out.println("Produção regitrada");
            } else if (opcao==3) {
                System.out.println("Saindo do menu...");
            } else
                System.out.println("Digite uma opção válida!");
        } while (opcao!=3);
        sc.close();
    }
}
