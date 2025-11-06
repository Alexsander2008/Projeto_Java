package Exemplos;

public class POO_02_Pessoa {
    public String nome;
    public double altura, peso;
    // Declaração dos atributos (variáveis) do objeto da classe pessoa

    void ClassificaoIMC() { // Criação de um método ClassificacaoIMC para a classe
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
