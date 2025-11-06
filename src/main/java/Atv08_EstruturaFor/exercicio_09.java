package Atv08_EstruturaFor;

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Aperte ENTER para iniciar o programa");
        sc.nextLine();

        for(int veiculo=1;veiculo<4;veiculo++){
            System.out.println("Calibrando veículo "+veiculo);
        }
    }
}
