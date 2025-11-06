package Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String estado;
        char resp;

        do {
            do {
                System.out.println("Digite o estado do lote de peças (aprovado, reprovado, retrabalho ou análise manual)");
                estado = sc.nextLine();

                if (!estado.equalsIgnoreCase("aprovado") && !estado.equalsIgnoreCase("reprovado") && !estado.equalsIgnoreCase("retrabalho") && !estado.equalsIgnoreCase("análise manual")) {
                    System.out.println("Digite uma resposta válida!");
                }
            } while (!estado.equalsIgnoreCase("aprovado") && !estado.equalsIgnoreCase("reprovado") && !estado.equalsIgnoreCase("retrabalho") && !estado.equalsIgnoreCase("análise manual"));

            System.out.println(classificacao(estado));
            System.out.println("Deseja contiuar? (s/n)");
            resp= sc.next().charAt(0);
        }while (resp!= 'n');

        sc.close();
    }

    public static String classificacao (String clas) {
        String classificacao;

        if (clas.equalsIgnoreCase("aprovado")) {
            classificacao= "A peça está aprovada";
        } else if (clas.equalsIgnoreCase("reprovado")) {
            classificacao= "A peça está reprovada";
        } else if (clas.equalsIgnoreCase("retrabalho")) {
            classificacao= "A peça está em retrabalho";
        } else
            classificacao= "A peça está em análise";

        return classificacao;
    }
}
