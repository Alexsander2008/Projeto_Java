package Atv08_EstruturaIfElse;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite o peso das caixas em kg");
        int peso= sc.nextInt();

        if(peso>500){
            System.out.println("Capacidade excedida!");
        }
        else {
            System.out.println("Peso dentro do limite.");
        }
    }
}
