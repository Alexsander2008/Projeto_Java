package Exemplos;

import java.util.Scanner;

public class POO_01_mudularizacaoMain {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n1,n2;

        System.out.println("Digite o primeiro número");
        n1=sc.nextInt();
        System.out.println("Digite a operação (+, -, * ou /)");
        sc.nextLine();
        String op=sc.nextLine();
        System.out.println("Digite o segundo número");
        n2=sc.nextInt();

        if (op.equals("+")){
            System.out.println(POO_01_modularizacaoConta.soma(n1,n2));
        }
        else if (op.equals("-")) {
            System.out.println(POO_01_modularizacaoConta.subt(n1,n2));
        }
        else if (op.equals("*")) {
            System.out.println(POO_01_modularizacaoConta.mult(n1,n2));
        }
        else if (op.equals("/")) {
            System.out.println(POO_01_modularizacaoConta.div(n1,n2));
        }
        else
            System.out.println("Digite uma operação válida!");
        sc.close();
    }
}
