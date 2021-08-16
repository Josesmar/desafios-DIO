import java.util.Scanner;

public class CombinacaoString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Pega a quantidade de casos a ser verificado
        int casos = Integer.parseInt(scan.nextLine());

        //Percorre o número de casos
        for(int i = 1; i <= casos; i++) {
            StringBuilder analise = new StringBuilder();
            //Pega as palavras a serem combinadas
            String[] palavras = scan.nextLine().split(" ");

            int maxSize = Math.max (palavras[0].length(), palavras[1].length());

            for(int dados = 0; dados < maxSize; dados++) {
                if(dados < palavras[0].length()) {
                    analise.append(palavras[0].charAt(dados));
                }
                if(dados < palavras[1].length()) {
                    analise.append(palavras[1].charAt(dados));
                }
            }
            System.out.println(analise.toString());
        }
    }
}