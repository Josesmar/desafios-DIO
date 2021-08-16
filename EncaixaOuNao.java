/*
Paulinho tem em suas mãos um novo problema. Agora a sua professora lhe pediu que construísse um programa para verificar, 
à partir de dois valores muito grandes A e B, se B corresponde aos últimos dígitos de A.

Entrada
A entrada consiste de vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a
quantidade de casos de teste. Cada caso de teste consiste de dois valores A e B maiores que zero, cada um deles podendo ter até 1000 dígitos.

Saída
Para cada caso de entrada imprima uma mensagem indicando se o segundo valor encaixa no primeiro valor, confome exemplo abaixo.

 
Exemplo de Entrada	Exemplo de Saída
4
56234523485723854755454545478690 78690
5434554 543
1243 1243
54 64545454545454545454545454545454554

encaixa
nao encaixa
encaixa
nao encaixa
*/

import java.io.*;

public class EncaixaOuNao{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static void encaixa(String str1, String str2){
        if(str1.endsWith(str2))
            System.out.println("encaixa");
        else
            System.out.println("nao encaixa");
    }

    public static void main(String[] args) throws IOException{
        String entrada = br.readLine();
        String[] nums;
        int casos = Integer.parseInt(entrada);
        while(casos-- > 0){
            entrada = br.readLine();
            nums = entrada.split(" ");
            if(nums[0].equals(nums[1]))
                System.out.println("encaixa");
            else if(nums[0].length() < nums[1].length())
                System.out.println("nao encaixa");
            else
                encaixa(nums[0], nums[1]);
        }
    }
}
