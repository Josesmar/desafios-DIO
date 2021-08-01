/*
Desafio
Você deve fazer a leitura de 5 valores inteiros. 
Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, 
quantos valores informados são positivos e quantos valores informados são negativos.

Entrada
Você receberá 5 valores inteiros.

Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.

 
Exemplo de Entrada	Exemplo de Saída
-5
0
-3
-4
12

3 valor(es) par(es)
2 valor(es) impar(es)
1 valor(es) positivo(s)
3 valor(es) negativo(s)
*/


import java.io.IOException;
import java.util.Scanner;

public class AnaliseNumeros {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int par  = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        int count = 1;
        int valorLinha = 0;
//continue a solução
        for (int i = count; count < 6 ; count++) {
          valorLinha = leitor.nextInt();

          if (valorLinha % 2 == 0){
              par = par + 1;
          } else {
              impar = impar + 1;
            }
          if (valorLinha > 0) {
              positivo = positivo + 1;
          }
          if (valorLinha < 0){
              negativo = negativo + 1;
          }
        }

//insira suas variaveis corretamente
        System.out.println( par + " valor(es) par(es)");
        System.out.println( impar + " valor(es) impar(es)");
        System.out.println( positivo + " valor(es) positivo(s)");
        System.out.println( negativo + " valor(es) negativo(s)");
    }

}
