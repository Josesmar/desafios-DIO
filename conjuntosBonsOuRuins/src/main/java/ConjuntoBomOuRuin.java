/*Desafio
Nesse algoritmo você deverá descobrir se um conjunto de palavras é bom ou ruim. 
Por definição, um conjunto é bom quando nenhuma palavra desse conjunto é um prefixo 
de outra palavra. Caso contrário, é considerado um conjunto ruim.

Por exemplo, {dbc, dae, dbcde} é um conjunto ruim, pois dbc é um prefixo de dbcde. 
Quando duas palavras são idênticas, definimos como uma sendo prefixo da outra.

Entrada
A entrada contém vários casos de teste. A primeira linha de cada caso de 
teste terá um inteiro N (1 ≤ N ≤ 10⁵), que representa a quantidade de palavras no conjunto. 
Segue então N linhas, cada uma tendo uma palavra de no máximo 100 letras minúsculas. A entrada termina quando N = 0 e não deve ser processada.

Saída
Para cada caso de teste, você deverá imprimir "Conjunto Bom", 
ou "Conjunto Ruim", conforme explicado acima.

 Exemplo de Entrada	Exemplo de Saída
3
abc
dae
abcde
2
abc
def
0*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ConjuntoBomOuRuin {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());

       List<String> conjunto = new ArrayList(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
       List<String> entrada = new ArrayList<String>();

       Scanner ler = new Scanner(System.in, "ISO-8859-1");
       String conjuntoPalavras = ler.next();

        System.out.println(validarConjuntoBomOuRuim(conjuntoPalavras));
        System.out.println("teste");

    }
    public static String validarConjuntoBomOuRuim(String conjuntoDigitado){

        for (String str : conjuntoDigitado.split(" ")) {
            System.out.println(str.substring(0,1));
        }
        return validarConjuntoBomOuRuim(conjuntoDigitado);
    }
}
