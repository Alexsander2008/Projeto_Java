package Atv17_ListaDoWhile;

import java.util.Scanner;

/* WMS: Significa Warehouse Management System (Sistema de Gerenciamento de Armazém).
É um software para controlar e otimizar todas as operações dentro de um centro de distribuição ou armazém,
 desde o recebimento e armazenamento até a separação, embalagem e expedição de mercadorias. */

public class exercicio_12 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int palete, conf=0;

        do{
            System.out.println("Digite o número do palete:");
            palete = sc.nextInt();
            conf++;
        } while (palete!=-1);
        System.out.println("Paletes conferidos: "+conf);
    }
}
