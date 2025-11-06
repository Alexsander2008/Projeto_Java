package Exemplos.Listas;

// import das listas:
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class listas_01_tiposDeListas {
    static void main(String[] args) {

        // Os tipos de listas são:

        String[] array = {"item1", "item2", "item3"}; // lista do tipo array
        /* Diferente das proximas listas do exemplo a array é uma lista simples e estática,
        que serve para declarar mais valores a uma variável (que pode ser String, int...) */

        List linkedList = new LinkedList(); // lista tipo LinkedList
        /* LinkedList em Java é uma classe da estrutura de coleções que representa uma lista duplamente encadeada,
        onde cada elemento (chamado de nó) armazena seus dados e referências (ou "links") para o elemento anterior e o próximo.
        Diferentemente de arrays, os elementos não precisam estar em locais de memória contíguos,
        permitindo inserções e remoções eficientes em qualquer parte da lista. */

        List arrayList = new ArrayList(); // lista tipo ArrayList
        /* Um ArrayList em Java é uma estrutura de dados que armazena uma coleção de objetos em uma lista redimensionável,
        diferentemente dos arrays tradicionais que possuem tamanho fixo. Ele permite adicionar, remover,
        acessar e alterar elementos dinamicamente durante a execução do programa. */

        List vecList = new Vector(); // lista tipo Vector
        /* A classe Vector é uma implementação mais antiga da interface List, similar à ArrayList,
        mas com a diferença de ser thread-safe (sincronizada) e aumentar o dobro do seu tamanho quando necessário. */

        List stackList = new Stack(); // lista tipo Stack
        /* A classe Stack em Java é uma implementação da estrutura de dados pilha, que opera com o princípio
        LIFO (Last-In, First-Out), ou seja, "Último a Entrar, Primeiro a Sair".
        Ela é utilizada para armazenar e gerenciar objetos em uma ordem específica, como em operações de "desfazer" ou navegação de "voltar/avançar". */

    }
}
