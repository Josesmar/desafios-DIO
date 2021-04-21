import java.util.Scanner;

public class ValidaSenhaComRequisitos {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        String senha;
        final String requeridosNecessarios = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*)$";
        final String requisitosPermitidos = "[a-zA-Z0-9]+";

        while(lerDados.hasNextLine()) {
            senha = lerDados.nextLine();

            if ((senha.length() >=6) && (senha.length() <= 32) &&
              (senha.matches(requisitosPermitidos)) && (senha.matches(requeridosNecessarios))){
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }
        }
    }
}