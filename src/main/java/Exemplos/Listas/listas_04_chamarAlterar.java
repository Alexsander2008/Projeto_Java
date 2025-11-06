package Exemplos.Listas;

import java.util.ArrayList;
import java.util.List;

public class listas_04_chamarAlterar {
    static void main(String[] args) {
        List<String> letras = new ArrayList<String>();
        letras.add("A");
        letras.add("B");
        letras.add("C");

        // uso do  método get() para acessar um elemento em um índice específico:

        System.out.println("Elemento 3: " + letras.get(2)); // Como os indices começam em 0 o primeiro elemento da lista é o índice 0

        // uso de método set() para substituir um elemento  por outro:

        letras.set(2, "D"); // Aqui trocamos o terceiro elemento pela letra D
        for (String letra : letras) { // Este laço for irá printar um elemento por vez até chegar ao final da lista
            System.out.println(letra);
        }
    }
}
