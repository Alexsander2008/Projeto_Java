package Atv08_EstruturaIfElse;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite o nível de óleo da máquina em %");
        int oleo= sc.nextInt();

        if (oleo<30){
            System.out.println("Adicionar óleo");
        }
        else{
            System.out.println("Nível adequado");
        }
    }
}
