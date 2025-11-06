package Atv12B_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Double c, f;

        System.out.println("Digite a temperatura em graus Celsius para converter para Fahrenheit:");
        c= sc.nextDouble();

        f= ((c*9/5)+32);

        System.out.println(c+"°C em Fahrenheit é: "+f+"°F");
    }
}
