/* Um palíndromo  é  um  número que  é  lido  da mesma  forma  tanto da  direita  para
 a  esquerda  como  da esquerda  para  a direita. Por exemplo, cada um dos inteiros
 seguintes, de quatro dígitos, são palíndromo:  1331, 5555, 4554 e 1661. Escreva um
 algoritmo que leia um número de quatro dígitos e determine se ele e palíndromo ou
  não. Se o número não for de quatro dígitos imprima uma mensagem de erro.
 */
import java.util.Scanner;
public class Lista3Att9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, mc, du, centena, invertido, milhar;
        System.out.println("\t PALINDROMO");
        System.out.print("Informe um numero de quatro algarismo:");
        numero = ler.nextInt();
        if ((numero < 1000) || (numero > 9999)) {
            System.out.println("O numero deve ter quatro algorismo");
        }
        else {
            mc = numero / 100;
            du = numero % 100;
            milhar = mc / 10;
            centena = mc % 10;
            invertido = centena * 10 + milhar;
            if (invertido==du) {
                System.out.println("O numero é um palindromo");
            }
            else {
                System.out.println("O numero não é um palindromo");
            }
        }
    }
}
