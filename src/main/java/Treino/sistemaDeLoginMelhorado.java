package Treino;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class sistemaDeLoginMelhorado {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        String emailC="javaSenai@gmail.com";
        String senhaC="javaSenai123@";
        String conta;
        String nome;
        String user;
        String email;
        String senha;
        String pcpre;
        String simNao;
        String boleto;

        double precopc1= 1.861;
        double precopc2= 5.652;
        double precopc3= 13.980;

        int idade;
        int tele;
        int tent;
        int pc;
        int paga;
        int x=30;

        char gen;

        while (true) {
            System.out.println("Bem vindo(a) ao sistema da black teck!");

            System.out.println("Primeiro vamos fazer o login");

            System.out.println("Voce ja tem uma conta no site da black teck?");
            conta = sc.nextLine();

            if (conta.equals("sim")) {
                System.out.println("Otimo, entao digite seu email e senha!");

                for (tent=3; tent>=0; tent--) {
                    System.out.println("Email:");
                    email=sc.nextLine();

                    System.out.println("Senha:");
                    senha=sc.nextLine();

                    if (email.equals(emailC) && senha.equals(senhaC)) {
                        System.out.println("Acesso liberado, bom proveito do nosso site!");

                        System.out.println("Voce tem interesse na compra de computadores pre montados?");
                        pcpre=sc.nextLine();

                        if (pcpre.equals("sim")) {
                            System.out.println("Otimo, entao vamos para as opcoes!");

                            while (true) {
                                System.out.println("No momentos temos as seguintes opcoes:");

                                System.out.println("Computador para escritorio(baixo rendimento): "+precopc1+" reais");

                                System.out.println("Computador gamer padrao(medio rendimento): "+precopc2+" reais");

                                System.out.println("Computador para alto desempenho(alto rendimento): "+precopc3+"0 reais");

                                System.out.println("Voce tem interesse em comprar algum dos nossos computadores?");
                                simNao=sc.nextLine();

                                if (simNao.equals("sim")) {
                                    System.out.println("Otimo! Entao, digite 1 para o computador de baixo rendimento, 2 para o de medio rendimento e 3 para o de alto rendimento!");
                                    pc=sc.nextInt();

                                    if (pc==1) {
                                        System.out.println("Entao voce escolheu o pc "+pc+"!");
                                        System.out.println("Aqui na black tech, nos escolhemos a dedo cada peca do computador, com o melhor custo beneficio possivel!");

                                        System.out.println("Qual seria a forma de pagamento?");
                                        System.out.println("Digite 1 para cartao de credito, 2 para debito, 3 para pix e 4 para uma geracao de boleto.");
                                        paga=sc.nextInt();

                                        if (paga==1) {
                                            System.out.println("Voce escolheu pagar com um cartao de credito!");

                                            System.out.println("Deseja finalizar a compra?");
                                            simNao=sc.nextLine();

                                            System.out.println("Compra finalizada! confira o seu email para mais informacoes.");
                                            System.exit(0);
                                        }
                                        else if (paga==2) {
                                            System.out.println("Voce escolheu pagar com um cartao de debito!");

                                            System.out.println("Deseja finalizar a compra?");
                                            simNao=sc.nextLine();

                                            System.out.println("Compra finalizada! confira o seu email para mais informacoes.");
                                            System.exit(0);
                                        }
                                        else if (paga==3) {
                                            System.out.println("Voce escolheu pagar com pix!");

                                            System.out.println("Deseja finalizar a compra?");
                                            simNao=sc.nextLine();

                                            System.out.println("Compra finalizada! confira o seu email para mais informacoes.");
                                            System.exit(0);
                                        }
                                        else if (paga==4) {
                                            System.out.println("Voce escolheu pagar com boleto!");

                                            System.out.println("Deseja gerar o boleto?");
                                            boleto=sc.nextLine();
                                            boleto=sc.nextLine();

                                            if (boleto.equals("sim")) {
                                                System.out.println("Gerando boleto...");

                                                while (x!=0) {
                                                    System.out.println("Tempo faltante para gerar o boleto: "+x+" segundos");
                                                    x--;
                                                }
                                                System.out.println("Boleto gerado, deseja finalizar a compra?");
                                                simNao=sc.nextLine();

                                                System.out.println("Compra finalizada! confira o seu email para mais informacoes.");
                                                System.exit(0);
                                            }
                                            else {
                                                System.out.println("entao escolha outra forma de pagamento.");
                                                System.exit(0);
                                            }
                                        }
                                    }
                                    else if (pc==2) {
                                        System.out.println("Entao voce escolheu o pc "+pc+"!");
                                        System.out.println("Aqui na black tech, nos escolhemos a dedo cada peca do computador, com o melhor custo beneficio possivel!");

                                        System.out.println("Qual seria a forma de pagamento?");
                                        System.out.println("Digite 1 para cartao de credito, 2 para debito, 3 para pix e 4 para uma geracao de boleto.");
                                        paga=sc.nextInt();

                                        if (paga==1) {
                                            System.out.println("Voce escolheu pagar com um cartao de credito!");

                                            System.out.println("Deseja finalizar a compra?");
                                            simNao=sc.nextLine();

                                            System.out.println("Compra finalizada! confira o seu email para mais informacoes.");
                                            System.exit(0);
                                        }
                                        else if (paga==2) {
                                            System.out.println("Voce escolheu pagar com um cartao de debito!");

                                            System.out.println("Deseja finalizar a compra?");
                                            simNao=sc.nextLine();

                                            System.out.println("Compra finalizada! confira o seu email para mais informacoes.");
                                            System.exit(0);
                                        }
                                        else if (paga==3) {
                                            System.out.println("Voce escolheu pagar com pix!");

                                            System.out.println("Deseja finalizar a compra?");
                                            simNao=sc.nextLine();

                                            System.out.println("Compra finalizada! confira o seu email para mais informacoes.");
                                            System.exit(0);
                                        }
                                        else if (paga==4) {
                                            System.out.println("Voce escolheu pagar com boleto!");

                                            System.out.println("Deseja gerar o boleto?");
                                            boleto=sc.nextLine();
                                            boleto=sc.nextLine();

                                            if (boleto.equals("sim")) {
                                                System.out.println("Gerando boleto...");

                                                while (x!=0) {
                                                    System.out.println("Tempo faltante para gerar o boleto: "+x+" segundos");
                                                    x--;
                                                }
                                                System.out.println("Boleto gerado, deseja finalizar a compra?");
                                                simNao=sc.nextLine();

                                                System.out.println("Compra finalizada! confira o seu email para mais informacoes.");
                                                System.exit(0);
                                            }
                                            else {
                                                System.out.println("entao escolha outra forma de pagamento.");
                                                System.exit(0);
                                            }
                                        }


                                    }
                                    else if (pc==3) {
                                        System.out.println("Entao voce escolheu o pc "+pc+"!");
                                        System.out.println("Aqui na black tech, nos escolhemos a dedo cada peca do computador, com o melhor custo beneficio possivel!");

                                        System.out.println("Qual seria a forma de pagamento?");
                                        System.out.println("Digite 1 para cartao de credito, 2 para debito, 3 para pix e 4 para uma geracao de boleto.");
                                        paga=sc.nextInt();

                                        if (paga==1) {
                                            System.out.println("Voce escolheu pagar com um cartao de credito!");

                                            System.out.println("Deseja finalizar a compra?");
                                            simNao=sc.nextLine();

                                            System.out.println("Compra finalizada! confira o seu email para mais informacoes.");
                                            System.exit(0);
                                        }
                                        else if (paga==2) {
                                            System.out.println("Voce escolheu pagar com um cartao de debito!");

                                            System.out.println("Deseja finalizar a compra?");
                                            simNao=sc.nextLine();

                                            System.out.println("Compra finalizada! confira o seu email para mais informacoes.");
                                            System.exit(0);
                                        }
                                        else if (paga==3) {
                                            System.out.println("Voce escolheu pagar com pix!");

                                            System.out.println("Deseja finalizar a compra?");
                                            simNao=sc.nextLine();

                                            System.out.println("Compra finalizada! confira o seu email para mais informacoes.");
                                            System.exit(0);
                                        }
                                        else if (paga==4) {
                                            System.out.println("Voce escolheu pagar com boleto!");

                                            System.out.println("Deseja gerar o boleto?");
                                            boleto=sc.nextLine();
                                            boleto=sc.nextLine();

                                            if (boleto.equals("sim")) {
                                                System.out.println("Gerando boleto...");

                                                while (x!=0) {
                                                    System.out.println("Tempo faltante para gerar o boleto: "+x+" segundos");
                                                    x--;
                                                }
                                                System.out.println("Boleto gerado, deseja finalizar a compra?");
                                                simNao=sc.nextLine();

                                                System.out.println("Compra finalizada! confira o seu email para mais informacoes.");
                                                System.exit(0);
                                            }
                                            else {
                                                System.out.println("entao escolha outra forma de pagamento.");
                                                System.exit(0);
                                            }
                                        }
                                    }

                                    else {
                                        System.out.println("Resposta invalida, insira uma resposta valida!");
                                        System.exit(0);
                                    }
                                }
                                else {
                                    System.out.println("Sinto muito, mas nao podemos te ajudar entao...");
                                    System.exit(0);
                                }
                            }


                        }
                        else {
                            System.out.println("Entao voce deseja fazer a manutencao de alguma maquina?");
                            pcpre=sc.nextLine();

                            if (pcpre.equals("sim")) {
                                System.out.println("Sinto muito, mas o nosso servico de manutencao esta indisponivel no momento. Tente novamente mais tarde!");
                                System.exit(0);
                            }
                            else {
                                System.out.println("Sinto muito, mas o nosso site nao tem mais opcoes. Volte sempre!");
                                System.exit(0);
                            }
                        }


                    }
                    else {
                        System.out.println("O email ou a senha estao incorretos");
                        System.out.println("Tentativas restantes: "+tent);
                    }
                }
                System.out.println("Tentativas maximas de login excedidas, sua conta foi bloqueada temporariamente");
                System.exit(0);


            }
            else {
                System.out.println("Tudo bem, entao vamos criar a sua conta");
                System.out.println("Qual o seu nome?");
                nome = sc.nextLine();

                System.out.println("Quantos anos voce tem?");
                idade = sc.nextInt();

                if (idade >= 18) {

                    System.out.println("Otimo, e qual seria o seu genero?");
                    gen = sc.next().charAt(0);

                    System.out.println("Qual seria o seu username?");
                    user = sc.nextLine();

                    System.out.println("Estamos quase terminando! Agora, digite seu email");
                    email = sc.nextLine();

                    System.out.println("E por ultimo, sua senha");
                    senha = sc.nextLine();

                    System.out.println("Muito bem, agora voce tem uma conta!");

                } else {
                    System.out.println("Sinto muito, mas nosso site so esta disponivel para maiores de 18 anos");
                    System.exit(0);
                }
            }
        }
    }
}