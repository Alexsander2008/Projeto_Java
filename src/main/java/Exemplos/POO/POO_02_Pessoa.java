package Exemplos.POO;

public class POO_02_Pessoa {
    public String nome;
    public double altura, peso;
    // Declaração dos atributos (variáveis) do objeto da classe pessoa. Com visibilidade 'public'

    /* Em Java, visibilidade refere-se aos modificadores de acesso (public, private, protected, e default)
     * que controlam o nível de acesso a classes, atributos e métodos.
     * O modificador public torna um membro acessível de qualquer lugar,
     * private o restringe à sua própria classe,
     * protected permite acesso no mesmo pacote e por subclasses,
     * enquanto default (sem palavra-chave) limita o acesso apenas às classes do mesmo pacote. */

    void ClassificaoIMC() { // Criação de um método ClassificacaoIMC para a classe
    /* Em Java, você usa void como o tipo de retorno de um método para indicar que ele não retorna nenhum valor ao ser executado.
    * Em vez de produzir um resultado para ser usado em outro lugar,
    * um método void apenas realiza uma ação ou modifica o estado de um objeto, sem a necessidade de uma instrução return com um valor. */

        double imc = peso / (Math.pow(altura, altura));
        System.out.printf("Olá "+nome+" seu IMC é: %.2f%n", imc);

        String msg= "Classificação do imc: ";
        if (imc<18.5) {
            System.out.println(msg+"abaixo do peso");
        }
        else if (imc>=18.5 && imc<24.9) {
            System.out.println(msg+"peso normal");
        }
        else if (imc>=25 && imc<29.9) {
            System.out.println(msg+"a cima do peso");
        }
        else if (imc>=30 && imc<34.9) {
            System.out.println(msg+"obesidade classe 1");
        }
        else if (imc>=35 && imc<39.9) {
            System.out.println(msg+"obesidade classe 2");
        }
        else if (imc>=40) {
            System.out.println(msg+"obesidade classe 3");
        }
    }
}
