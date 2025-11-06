package Atv17_ListaDoWhile;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_15 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double valCalibrado;

        System.out.println("Digite o valor da calibrado: ");
        valCalibrado = sc.nextDouble();

        if (valCalibrado<4.0 || valCalibrado>20.0) {
            do {
                System.out.println("Valor fora da faixa, digite novamente:");
                valCalibrado = sc.nextDouble();
            } while (valCalibrado < 4.0 || valCalibrado > 20.0);
        }

        System.out.println("Calibração OK: " + valCalibrado);
    }
}
