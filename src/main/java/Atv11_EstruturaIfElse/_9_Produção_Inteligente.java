package Atv11_EstruturaIfElse;

import java.util.Locale;
import java.util.Scanner;

public class _9_Produção_Inteligente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos conferir o estado do lote, ele passou na verificação de integridade?");
        String texto1 = sc.nextLine();
        if (texto1.equalsIgnoreCase("sim")){
            System.out.println("Certo, quer conferir se está adequado para a transferencia ?");
            String texto2 = sc.nextLine();
            if (texto2.equalsIgnoreCase("sim")){
                System.out.println("Certo, digite a % de estado em que ela se encontra");
                int estado = sc.nextInt();
                if (estado > 10){
                    System.out.println("ACIONANDO ALERTA DE DEFEITO !!!");
                }else if (estado <= 10) {
                    System.out.println("O lote está aprovado");
                }
            }
        }
    }
}
