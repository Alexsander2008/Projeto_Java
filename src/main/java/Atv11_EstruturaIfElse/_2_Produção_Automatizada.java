package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _2_Produção_Automatizada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Codigo peça 1 (001)");
        System.out.println("Codigo peça 1 (002)");
        System.out.println("Codigo peça 1 (003)");
        System.out.println("Codigo peça 1 (004)");
        System.out.println("Deseja verificar o lote ?");
        String texto1 = sc.nextLine();
        if (texto1.equals("001")) {
            System.out.println("Este lote está em retrabalho");
        } else if (texto1.equals("002")) {
            System.out.println("Este lote está pronto");
        } else if (texto1.equals("003")) {
            System.out.println("Este lote está em analise");
        } else if (texto1.equals("004")) {
            System.out.println("Este lote está danificado");
        } else
            System.out.println("Digite um codigo valido");
    }
}
