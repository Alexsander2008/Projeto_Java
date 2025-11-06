package atv18_exercicio;

import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma senha: ");
        String senha = sc.nextLine();

        while (!senhaValida(senha)) {
            System.out.println("Senha inválida! Deve ter pelo menos 8 caracteres, um número e uma letra maiúscula.");
            System.out.print("Digite novamente: ");
            senha = sc.nextLine();
        }

        System.out.println("Senha válida! ✅");

        sc.close();
    }

    public static boolean senhaValida(String senha) {
        boolean nu = false;
        boolean ma = false;

        if (senha.length() < 8) {
            return false;
        }

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            if (Character.isDigit(c)) {
                nu = true;
            }
            if (Character.isUpperCase(c)) {
                ma = true;
            }
        }


        if (nu && ma) {
            return true;
        } else {
            return false;
        }
    }
}

