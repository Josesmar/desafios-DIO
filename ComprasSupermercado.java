/*
Desafio
Pedro trabalha sempre até tarde todos os dias, com isso tem pouco tempo tempo para as tarefas domésticas. 
Para economizar tempo ele faz a lista de compras do supermercado em um aplicativo e costuma 
anotar cada item na mesma hora que percebe a falta dele em casa.

O problema é que o aplicativo não exclui itens duplicados, como Pedro anota o mesmo 
item mais de uma vez e a lista acaba ficando extensa. Sua tarefa é melhorar o aplicativo 
de notas desenvolvendo um código que exclua os itens duplicados da lista de compras e que os ordene alfabeticamente.

Entrada
A primeira linha de entrada contém um inteiro N (N < 100) com a quantidade de 
casos de teste que vem a seguir, ou melhor, a quantidade de listas de compras para organizar. 
Cada lista de compra consiste de uma única linha que contém de 1 a 1000 itens ou palavras 
compostas apenas de letras minúsculas (de 1 a 20 letras), sem acentos e separadas por um espaço.

Saída
A saída contém N linhas, cada uma representando uma lista de compra, 
sem os itens repetidos e em ordem alfabética.
 
Exemplo de Entrada	Exemplo de Saída
2
carne laranja suco picles laranja picles
laranja pera laranja pera pera

carne laranja picles suco
laranja pera
*/


import java.io.IOException;
import java.util.TreeSet;
import java.util.*;
import java.util.Set;

public class ComprasSupermercado {

    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        String itensAComprar;

        List<List<String>> listaItensAComprar = new ArrayList() {
            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < this.size(); i++) {
                    sb.append(this.get(i) + " ");
                }
                return sb.toString();
            }
        };
        Set<String> treeSet = new TreeSet<>();

        //Pega o primeiro valor
        int N = ler.nextInt();
        ler.nextLine();

        for (int i = 0; i < N; i++) {
            itensAComprar = ler.nextLine();
            String[] item = itensAComprar.split(" ");

            for (int j = 0; j < item.length; j++) {
                treeSet.add(item[j].toLowerCase());
            }

            List<String> listaAComprarImprimir = new ArrayList<>() {
                @Override
                public String toString() {
                    StringBuilder stb = new StringBuilder();

                    for (int i = 0; i < this.size(); i++) {
                        stb.append(this.get(i) + " ");
                    }
                    return stb.toString();
                }
            };

            Iterator<String> iteratorListaAComprar = treeSet.iterator();
            while (iteratorListaAComprar.hasNext()) {
                listaAComprarImprimir.add(iteratorListaAComprar.next());
            }

            listaItensAComprar.add(listaAComprarImprimir);
            treeSet.clear();

        }
        listaItensAComprar.forEach(System.out::println);
        ler.close();
    }
}



