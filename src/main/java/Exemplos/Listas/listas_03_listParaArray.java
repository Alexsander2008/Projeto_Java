package Exemplos.Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listas_03_listParaArray {
    static void main(String[] args) {

        // Convertendo listas em arrays:

        List<String> diasList = new ArrayList<String>();
        diasList.add("Segunda-Feira");
        diasList.add("Terça-Feira");
        diasList.add("Quarta-Feira");
        diasList.add("Quinta-Feira");
        diasList.add("Sexta-Feira");
        diasList.add("Sábado");
        diasList.add("Domingo");

        String[] diasArray = diasList.toArray(new String[diasList.size()]); // Convertemos a List para array utilizando o método .toArray

        System.out.println("List: " + diasList);
        System.out.println("Array: " + Arrays.toString(diasArray));
        // Printamos a List e a array
    }
}
