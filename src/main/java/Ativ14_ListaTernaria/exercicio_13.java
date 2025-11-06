package Ativ14_ListaTernaria;

import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int sal;

        System.out.println("Digite o salário do mano aí");
        sal=sc.nextInt();

        String resul=(sal>3000) ? "Mano ta ganhando bem" : "Mano ta pobri";
        System.out.println(resul);
        sc.close();
    }
}
