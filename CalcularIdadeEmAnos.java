import java.text.ParseException;
        import java.text.SimpleDateFormat;
        import java.util.Calendar;
        import java.util.Date;
        import java.util.Scanner;

public class CalcularIdadeEmAnos {
    public static void main(String[] args) throws ParseException {
        Scanner leitura = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite uma data de nascimento\n");
        Date dataNascimento = sdf.parse(leitura.nextLine());

        int idade = calculaIdade(dataNascimento);

        System.out.println("Sua idade é: " + idade);
    }
    public static int calculaIdade(java.util.Date dataNasc) {
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(dataNasc);
        Calendar dataHoje = Calendar.getInstance();
        int idade = dataHoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

        if (dataHoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
            idade--;
        }
        else
        {
        if (dataHoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) &&
           dataHoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
           idade--;
        }
        }
        return idade;
    }
}