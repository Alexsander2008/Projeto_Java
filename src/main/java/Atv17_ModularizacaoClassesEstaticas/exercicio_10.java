package Atv17_ModularizacaoClassesEstaticas;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int temp;

        System.out.println("Digite a temperatura do indicada no leitor em °C");
        temp= sc.nextInt();

        System.out.println(IoT(temp));
        sc.close();
    }

    public static String IoT (int x) {
        String msg;

        if (x<0) {
            msg= "Alerta de congelamento";
        } else if (x<40) {
            msg= "Temperatura normal";
        } else
            msg= "Alerta de superaquecimento";

        return msg;
    }
}
