package Exemplos.Base;

import java.util.Locale; // importar o objeto Locale

public class valoresArredondados {
    public static void main(String[] args) {
        String product1 = "Computer"; // String= Variável com valor de texto
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F'; // char= variável com valor de um caractere

        double price1 = 2100.0; // double= variável com valor real
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products: " +product1+ ", which price is $%.2f %n ", price1); // Função de arredondamento: %.(quantidade de casas decimais)f (Texto após a variável(Opcional))%n, variável para arredondar
        System.out.printf(product2+ ", which price is $%.2f %n", price2);
        System.out.println(); // print vazio para dar um espaçamento de uma linha entre as mensagens
        System.out.println("Record: "+age+ " years old, code "+code+ " and gender: " +gender);
        System.out.println();
        System.out.printf("Measure with eight decimal plates: %.8f %n", measure);
        System.out.printf("Rounded(three decimal places): %.3f %n", measure);

        Locale.setDefault(Locale.US); // Locale.setDefault(Locale.Linguagem de uma região específica)
        System.out.printf("US decimal point: %.3f %n", measure);
    }
}
