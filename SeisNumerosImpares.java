import java.io.IOException;
import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor");
        int x = leitor.nextInt();
        int cont = 0;

        while (cont < 6) {
            if (x  %  2 !=0) {
                System.out.println(x);
                cont++;
            }
            x++;
        }
    }

}
