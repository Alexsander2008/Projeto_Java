package Atv08_EstruturaIfElse;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite o peso da peça");
        double peso= sc.nextDouble();

        if (peso>=5){
            System.out.println("Peça pesada");
        }
        else{
            System.out.println("Peça leve");
        }
    }
}
