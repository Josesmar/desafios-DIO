import java.util.Scanner;
import java.util.Locale;

public class EntradaSaidaCPF {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        Scanner sc = new Scanner(System.in);

        String[] cpf = new String[4];
        cpf = sc.nextLine().split("\\.|-");

        for(int i = 0 ;  i < 4  ; i++)
            System.out.printf("%s\n",cpf[i]);
        sc.close();
    }
}