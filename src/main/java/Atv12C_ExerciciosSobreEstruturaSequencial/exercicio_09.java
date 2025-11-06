package Atv12C_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double base1, base2, altura;

        System.out.println("Digite o tamanho da base maior do trapézio em cm");
        base1= sc.nextDouble();
        System.out.println("Digite o tamanho da base menor do trapézio em cm");
        base2= sc.nextDouble();
        System.out.println("Digite o tamanho da altura do trapézio em cm");
        altura= sc.nextDouble();

        System.out.println("A área do trapézio é de: "+(((base1+base2)*altura)/2)+"cm");
    }
}
