package Exemplos.POO;

import java.util.Scanner;

public class POO_02_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        POO_02_Pessoa pessoa1= new POO_02_Pessoa(); // Criamos a variável pessoa1 para definir os dados da primeira pessoa

        System.out.println("Gostaria de calcular seu IMC?");
        String resp = sc.nextLine();

        do {
            if (resp.equalsIgnoreCase("sim")) {
                System.out.println("Digite seu nome:");
                pessoa1.nome = sc.nextLine(); // Armazenamos o valor da variável nome presente na outra classe
                System.out.println("Digite sua altura:");
                pessoa1.altura = sc.nextDouble(); // Armazenamos o valor da variável altura presente na outra classe
                System.out.println("Digite seu peso:");
                pessoa1.peso = sc.nextDouble(); // Armazenamos o valor da variável peso presente na outra classe

                pessoa1.ClassificaoIMC(); // Chamamos o método para a execução do código

                System.out.println("Gostaria de tentar novamente?");
                resp = sc.nextLine();
            }
            else if (!resp.equalsIgnoreCase("não")) {
                System.out.println("Digite uma resposta válida");
                System.out.println("Gostaria de tentar novamente?");
                resp = sc.nextLine();
            }

        } while (!resp.equalsIgnoreCase("não"));

        System.out.println("OK até a proxima!");
        System.out.println("Aperte ENTER para fechar o programa");
        sc.nextLine();
        sc.close();
    }
}
