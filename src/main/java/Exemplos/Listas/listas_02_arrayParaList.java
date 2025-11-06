package Exemplos.Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listas_02_arrayParaList {
    static void main(String[] args) {

        // Convertendo arrays em listas:

        String[] itensArray = {"item1", "item2", "item3"};
        List<String> itensArrayList = new ArrayList<String>(); //A ArrayList está declarada como String

        System.out.println("array: " + Arrays.toString(itensArray)); // Printamos o array criado nas declarações a cima com o método .toString

        for (String itens : itensArray) { // Aqui criamos um for para iterar pela lista e adicionar um item a cada repetição do loop
            itensArrayList.add(itens);
            System.out.println("Adicionado à ArrayList: " + itensArrayList); // O print mostra que a cada iteração um item da nossa array é adicionado à nossa ArrayList
        }
        System.out.println("Array list completa: "+ itensArrayList);
        // Isto pode ser feito com todos os tipos de List

    }
}
