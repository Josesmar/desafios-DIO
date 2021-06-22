import java.io.IOException;
import java.util.TreeSet;
import java.util.*;
import java.util.Set;

public class ComprasSupermercado {

    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        String itensAComprar;

        List<List<String>> listaItensAComprar = new ArrayList() {
            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < this.size(); i++) {
                    sb.append(this.get(i) + " ");
                }
                return sb.toString();
            }
        };
        Set<String> treeSet = new TreeSet<>();

        //Pega o primeiro valor
        int N = ler.nextInt();
        ler.nextLine();

        for (int i = 0; i < N; i++) {
            itensAComprar = ler.nextLine();
            String[] item = itensAComprar.split(" ");

            for (int j = 0; j < item.length; j++) {
                treeSet.add(item[j].toLowerCase());
            }

            List<String> listaAComprarImprimir = new ArrayList<>() {
                @Override
                public String toString() {
                    StringBuilder stb = new StringBuilder();

                    for (int i = 0; i < this.size(); i++) {
                        stb.append(this.get(i) + " ");
                    }
                    return stb.toString();
                }
            };

            Iterator<String> iteratorListaAComprar = treeSet.iterator();
            while (iteratorListaAComprar.hasNext()) {
                listaAComprarImprimir.add(iteratorListaAComprar.next());
            }

            listaItensAComprar.add(listaAComprarImprimir);
            treeSet.clear();

        }
        listaItensAComprar.forEach(System.out::println);
        ler.close();
    }
}



