/*
Desafio
Crie um programa que leia 6 valores. Você poderá receber valores negativos e/ou positivos como entrada, 
devendo desconsiderar os valores nulos. Em seguida, apresente a quantidade de valores positivos digitados.

Entrada
Você receberá seis valores, negativos e/ou positivos.

Saída
Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é exibido 
abaixo no exemplo de saída. Não esqueça da mensagem "valores positivos" ao final.

 
Exemplo de Entrada	Exemplo de Saída
7
-5
6
-3.4
4.6
12

4 valores positivos
*/


import java.io.*;
import java.util.Scanner;

public class QuantidadeNumerosPositivos {
    public static void main(String argos[]) throws IOException {
        //Leitura dos valores
        Scanner entrada = new Scanner(System.in);

        //Variáveis
        double i = 1;
        double valorLinha;
        int contador = 0;

        for (i = i; i <= 6; i++) {
            valorLinha = entrada.nextDouble();

            if (valorLinha > 0){
                contador ++;
            };
        };
        System.out.println(contador + " valores positivos");

        //fecha o leitor
        entrada.close();
    }
}
