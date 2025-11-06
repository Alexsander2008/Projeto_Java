package Exemplos;

import java.util.Scanner;

public class while_exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();//5
        int soma = 0;
        while (x != 0) { //enquanto x for diferente de zero
            soma += x;
            //neste pedaço estou pegando o que esta sendo digitado
            //pelo usuario e inserido dentro da variavel soma
            x = sc.nextInt();
            //Assim que o usuario digitar 0 ele salta do while
            //direto para a impressão mostrando o conteudo da soma
        }
        System.out.println(soma);
        sc.close();
    }
}
