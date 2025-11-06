package Desafios_de_Programação_Lógica;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Verificação de palindromo em número
        int nInvertido=0, nOriginal;

        System.out.println("Digite o número para saber se ele é ou não um palíndromo");
        nOriginal= sc.nextInt();
        int n= nOriginal;

        while (n!=0) {
            int ultDigit= n%10;
            nInvertido= (nInvertido*10)+ultDigit;
            n= n/10;
        }
        if (nOriginal==nInvertido) {
            System.out.println(nOriginal+" é um palíndromo");
        }
        else
            System.out.println(nOriginal+" não é um palíndromo");

        // Verificação de palíndromo em palavra
        ;
        System.out.println("Agora digite uma palavra para saber se ela é ou não um palíndromo");
        String palavra= sc.next();
        String palavraInvert="";

        for (int i = palavra.length()-1; i>=0 ; i-- ) {
            palavraInvert+= palavra.charAt(i);
        }
        if (palavraInvert.equalsIgnoreCase(palavra)) {
            System.out.println("'"+palavra+"'"+" é um palíndromo");
        }
        else
            System.out.println("'"+palavra+"'"+" não é um palíndromo");
        sc.close();
    }
}
