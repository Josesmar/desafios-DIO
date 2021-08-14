import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class MediaNotaAluno{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        float n1,n2,n3,n4,media,emexame,emexamefinal;

        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();
        emexame = sc.nextFloat();

        media = ((n1 + n2 + n3 + n4) / 4);
        emexamefinal = ((media  + emexame) / 2);

        System.out.printf("Media: %.1f\n",media);

        //continue a solucao de acordo com o enunciado

        if (media >= 7.0){
            System.out.printf("Aluno aprovado.\n");
        }
        else if (media < 5.0){
            System.out.printf("Aluno reprovado.\n");
        }
        else {
            System.out.printf("Aluno em exame.\n");

            System.out.printf("Nota do exame: %.1f\n", emexame );

            if(media >= 7.0){
                System.out.printf("Aluno aprovado.\n");
                System.out.printf("Media final: %.1f\n", emexamefinal );
            }
            else{
                System.out.printf("Aluno reprovado.\n");
                System.out.printf("Media final: %.1f\n", emexamefinal );
            }
        }

        sc.close();
    }
}
