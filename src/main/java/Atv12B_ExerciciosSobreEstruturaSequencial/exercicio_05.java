package Atv12B_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double salr, aumento;

        System.out.println("Digite o salário do funcionário.");
        salr= sc.nextDouble();

        aumento=((salr/100)*10);

        System.out.println("O salário do funcionário com um aumeto de 10% é de: R$" +(salr+aumento));
    }
}
