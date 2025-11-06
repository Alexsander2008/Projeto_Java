package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _16_Inspeção_Automatizada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Como está o defeito da peça ?");
        System.out.println("Vísivel");
        System.out.println("Microscopico");
        System.out.println("Ausente");
        String texto1 = sc.nextLine();
        if (texto1.equalsIgnoreCase("Visivel")){
            System.out.println("A peça está defeituosa, deve voltar para a produção");
        } else if (texto1.equalsIgnoreCase("Microscopic")) {
            System.out.println("A peça está com um defeito médio, revise antes de mandar");
        } else if (texto1.equalsIgnoreCase("Ausente")) {
            System.out.println("A peça está com qualidade boa/ótima, pode mandar para o estoque");
        }else
            System.out.println("Digite as condições válidas");
    }
}
