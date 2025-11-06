package Exemplos;

import java.util.Scanner;

public class condicionalTernaria {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double preco, desc;

        System.out.println("Quanto deu o valor da compra?");
        preco= sc.nextDouble();

        desc=(preco>50) ? preco*0.1 : preco*0.05; // condicional ternária: serve como um if simplificado "variável= (condição) ? verdadeiro : falso"
        System.out.printf("O valor com deconto é: R$%.2f%n", (desc+preco));
    }
}
