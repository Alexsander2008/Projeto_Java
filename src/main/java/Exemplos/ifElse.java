package Exemplos;
import java.util.Locale;
import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite quantos minutos foram usados no plano");
        int min= sc.nextInt();

        double conta= 50;

        if (min>100){
            conta+= (min-100)*2.0; // "conta+=" supre a necessidade de escrever "conta= conta+..."

        }
        System.out.printf("Valor da conta: R$%.2f%n",conta);
        sc.close();
    }
}
