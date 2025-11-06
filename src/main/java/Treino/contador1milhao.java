package Treino;

import java.util.Scanner; // import da função de leitura do teclado

public class contador1milhao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Declaração da variável "sc" para o scanner

        System.out.println("Você gostaria de contar até um milhão? sim/não");

        String resp1 = sc.nextLine();

        if (resp1.equals("sim")) { // variável.equals para comparação de igualdade
            System.out.println("Qual número você gostaria de começar a contagem até um milhão");
            String resp2 = sc.nextLine(); // Leitura do scanner atribuída à variável resp

            int n = Integer.parseInt(resp2); // Tranforma a string resp2 em uma variável inteira

            while (n <= 1000000) {
                System.out.println(n);
                n = n + 1;

            }
        } else if (resp1.equals("não")) {


        }
    }
}