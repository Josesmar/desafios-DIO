import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class VisitaFeira {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); //Pimentões amarelhos
        int b = Integer.parseInt(st.nextToken()); //Pimentões vermelhos
        int total = a + b;
        System.out.println("X = " + total);
    }
}