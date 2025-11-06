package Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String perm;

        do {
            System.out.println("Digite sua função na fábrica");
            perm=sc.nextLine();

            if (!perm.equalsIgnoreCase("basico") && !perm.equalsIgnoreCase("supervisor") && !perm.equalsIgnoreCase("engenheiro")) {
                System.out.println("Digite uma resposta correta!");
            }
        } while (!perm.equalsIgnoreCase("basico") && !perm.equalsIgnoreCase("supervisor") && !perm.equalsIgnoreCase("engenheiro"));

        System.out.println(verificacao(perm));
        sc.close();
    }
    public static String verificacao (String func) {

        String verificacao;

        if (func.equalsIgnoreCase("basico")) {
            verificacao="acesso restrito";

        }
        else if (func.equalsIgnoreCase("supervisor")) {

            verificacao="acesso parcial";

        }
        else
            verificacao="acesso total";

        return verificacao;
    }
}
