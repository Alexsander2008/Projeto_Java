package Treino;

import java.util.Scanner;

public class sistemaDeLoginIfElseWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String loginC = "x";
        String senhaC = "y";
        int tent = 4;

        while (tent > 0) {

            System.out.println("Digite o login");
            String login = sc.nextLine();
            System.out.println("Digite a senha");
            String senha = sc.nextLine();

            if (login.equals(loginC) && senha.equals(senhaC)) {
                System.out.println("Login realizado com sucesso, bom proveito do site!!");
                break;
            } else {
                tent--;
                System.out.println("Login ou senha incorretos");
            }
            if (tent > 0) {
                System.out.println("Total de tentativas restantes: "+tent);
                System.out.println("Tente novamente");
            }
            else {
                System.out.println("Conta bloqueada, consulte suporte para mais informacoes");
            }
        }
    }
}