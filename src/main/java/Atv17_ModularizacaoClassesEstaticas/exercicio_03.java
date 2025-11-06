package Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int modo;

        do {
            System.out.println("Digite a energia da maquina");
            modo=sc.nextInt();

           if (modo<0 || modo>100) {
               System.out.println("Digite um valor válido");
           }
        } while (modo<0 || modo>100);

        System.out.println(verificacao(modo));
        sc.close();
    }
    public static String verificacao (int ener) {

        String verificacao;

        if (ener<30) {

            verificacao= "A máquina entrará em modo econômico";
        }
        else if (ener>=30 && ener<=70) {

            verificacao= "A máquina entrará em modo normal";
        }
        else
            verificacao= "A máquina entrará em modo turbo";

        return verificacao;
    }
}
