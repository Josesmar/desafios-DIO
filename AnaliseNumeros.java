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