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
