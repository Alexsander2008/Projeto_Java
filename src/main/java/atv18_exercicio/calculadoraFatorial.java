package atv18_exercicio;

public class calculadoraFatorial {
    public static void calcularFatorial(int numero) {
        int fatorial = 1;
        int contador = numero;

        while (contador > 1) {
            fatorial *= contador;
            contador--;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }

    // Método principal (main) para testar
    public static void main(String[] args) {
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        calcularFatorial(numero);

        entrada.close();
    }
}

