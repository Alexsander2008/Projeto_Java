package Atv12C_ExerciciosSobreEstruturaSequencial;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         double km, l, cons;

        System.out.println("Digite os km percorridos pelo carro");
        km= sc.nextDouble();

        System.out.println("Digite quantos litros foram consumidos no trajeto");
        l= sc.nextDouble();

        System.out.println("O consumo médio no trajeto foi de "+(km/l)+" km/l");
    }
}
