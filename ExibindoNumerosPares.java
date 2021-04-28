import java.io.IOException;
import java.util.Scanner;

public class ExibindoNumerosPares {
    public static void main(String[] args) throws IOException {
        Scanner lerNumero = new Scanner(System.in);
        int valor = lerNumero.nextInt();

        for (int i = 2 ; i <=valor; i++) {
            int resultado = (i % 2);
            if (resultado == 0){
                System.out.println(i);
            }
        }
    }
}
