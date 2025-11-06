package Ativ14_ListaTernaria;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        double nota;

        System.out.println("Digite a nota do aluno");
        nota=sc.nextDouble();

        String resul=(nota>=7) ? "Aluno passou, vai pra balneário esse ano" : "Aluno não passou, vai ver se vai pra balneário ano que vem";
        System.out.println(resul);
        sc.close();

    }
}
